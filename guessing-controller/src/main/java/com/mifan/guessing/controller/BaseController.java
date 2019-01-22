package com.mifan.guessing.controller;

import com.mifan.guessingapi.exception.GuessingErrorCode;
import com.mifan.guessingapi.exception.GuessingRunTimeException;
import com.mifan.guessingapi.response.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseController {

    private static Logger logger = LoggerFactory.getLogger( BaseController.class );

    @ModelAttribute
    public void init(HttpServletRequest request){
        Boolean error = (Boolean) request.getAttribute( "error" );
        if( null != error && error ){
            throw new GuessingRunTimeException(GuessingErrorCode.NOT_LOGIN);
        }
    }

    @ExceptionHandler(GuessingRunTimeException.class)
    public BaseResponse<String> exceptionProcess(HttpServletRequest request, HttpServletResponse
            response, GuessingRunTimeException ex) {
        logger.error("",ex);
        return BaseResponse.generateBadResponseEntity(GuessingErrorCode.getErrorCode(  ex.getErrorCode() ).getValue(),GuessingErrorCode.getErrorCode(  ex.getErrorCode() ).getMessage(),null);
    }

    @ExceptionHandler(Exception.class)
    public BaseResponse<String> exceptionProcess(HttpServletRequest request, HttpServletResponse
            response, Exception ex) {
        logger.error("",ex);
        return BaseResponse.generateBadResponseEntity(GuessingErrorCode.SYSTEM_ERROR.getMessage(),null);
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<String> runtimeExceptionProcess(HttpServletRequest request, HttpServletResponse
            response, RuntimeException ex) {
        logger.error("",ex);
        return BaseResponse.generateBadResponseEntity(GuessingErrorCode.SYSTEM_ERROR.getMessage(),null);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public BaseResponse<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        String errorMesssage = "";
        if ( !bindingResult.getFieldErrors().isEmpty()) {
//            errorMesssage += fieldError.getDefaultMessage() + "|";
            errorMesssage += bindingResult.getFieldErrors().get( 0 ).getDefaultMessage() ;
        }
        return BaseResponse.generateBadResponseEntity(errorMesssage,null);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public BaseResponse<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
        return BaseResponse.generateBadResponseEntity(GuessingErrorCode.SYSTEM_ERROR.getMessage(),null);
    }

}
