package com.mifan.guessingapi.request.callback;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CallbackRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String messageId;

    private String type;

    private String content;

    private String pushTime;
}
