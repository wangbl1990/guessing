package com.mifan.guessingutils;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class HttpClientUtil {

	public static String SendGET(String url, String param) {
		String result = "";// 访问返回结果
		BufferedReader read = null;// 读取访问结果

		try {
			// 创建url
			URL realurl = new URL(url + "?" + param);
			// 打开连接
			URLConnection connection = realurl.openConnection();
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent",
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			// 建立连接
			connection.connect();
			// 获取所有响应头字段
			// Map<String, List<String>> map = connection.getHeaderFields();
			// 遍历所有的响应头字段，获取到cookies等
			// for (String key : map.keySet()) {
			// System.out.println(key + "--->" + map.get(key));
			// }
			// 定义 BufferedReader输入流来读取URL的响应
			read = new BufferedReader(new InputStreamReader(
					connection.getInputStream(), "UTF-8"));
			String line;// 循环读取
			while ((line = read.readLine()) != null) {
				result += line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (read != null) {// 关闭流
				try {
					read.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	public static String post(String url,
							  Map<String, String> headMap,
							  Map<String, Object> params){
		try{
			HttpClient httpclient = new HttpClient();
			httpclient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
			PostMethod httpPost = new PostMethod(url);
			if(null != headMap){
				for(String key : headMap.keySet()){
					httpPost.setRequestHeader(key, headMap.get(key));
				}
			}

			if(null != params){
				for(String pkey : params.keySet()){
					httpPost.addParameter(pkey, String.valueOf(params.get(pkey)));
				}
			}
			httpclient.executeMethod(httpPost);

			BufferedReader reader = new BufferedReader(new InputStreamReader(httpPost.getResponseBodyAsStream()));
			StringBuffer stringBuffer = new StringBuffer();
			String str = "";
			while((str = reader.readLine()) != null){
				stringBuffer.append(str);
			}
			reader.close();
			return stringBuffer.toString();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public static String postHttplient(String url,
									   String xmlInfo){
		try{
			HttpClient httpclient = new HttpClient();
			httpclient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
			PostMethod httpPost = new PostMethod(url);
			httpPost.setRequestEntity(new StringRequestEntity(xmlInfo));
			httpclient.executeMethod(httpPost);

			BufferedReader reader = new BufferedReader(new InputStreamReader(httpPost.getResponseBodyAsStream()));
			StringBuffer stringBuffer = new StringBuffer();
			String str = "";
			while((str = reader.readLine()) != null){
				stringBuffer.append(str);
			}
			reader.close();
			return stringBuffer.toString();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

//	/**
//	 * 需要加密执行的
//	 * @param url
//	 * @param xmlInfo
//	 * @return
//	 * @throws Exception
//	 */
//	public static String postHttplientNeedSSL(String url,
//											  String xmlInfo,
//											  String cretPath,
//											  String mrchId)
//			throws Exception{
//		//选择初始化密钥文件格式
//		KeyStore keyStore = KeyStore.getInstance("PKCS12");
//		//得到密钥文件流
//		FileInputStream instream = new FileInputStream(new File(cretPath));
//		try{
//			//用商户的ID 来解读文件
//			keyStore.load(instream, mrchId.toCharArray());
//		}finally{
//			instream.close();
//		}
//		//用商户的ID 来加载
//		SSLContext sslcontext = SSLContexts.custom().loadKeyMaterial(keyStore, mrchId.toCharArray()).build();
//		// Allow TLSv1 protocol only
//		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" }, null, SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
//		//用最新的httpclient 加载密钥
//		CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
//		StringBuffer ret = new StringBuffer();
//		try{
//			HttpPost httpPost = new HttpPost(url);
//			httpPost.setEntity(new StringEntity(xmlInfo));
//			CloseableHttpResponse response = httpclient.execute(httpPost);
//			try{
//				HttpEntity entity = response.getEntity();
//				if(entity != null){
//					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(entity.getContent()));
//					String text;
//					while((text = bufferedReader.readLine()) != null){
//						ret.append(text);
//					}
//				}
//				EntityUtils.consume(entity);
//			}finally{
//				response.close();
//			}
//		}finally{
//			httpclient.close();
//		}
//		return ret.toString();
//	}

	public static String postHtpps(String urlStr,
								   String xmlInfo){
		try{
			URL url = new URL(urlStr);
			URLConnection con = url.openConnection();
			con.setDoOutput(true);
//			con.setRequestProperty("Pragma:", "no-cache");
//			con.setRequestProperty("Cache-Control", "no-cache");
			con.setRequestProperty("Content-Type", "text/xml;charset=utf-8");
			OutputStreamWriter out = new OutputStreamWriter(con.getOutputStream(), "utf-8");
			out.write(xmlInfo);
			out.flush();
			out.close();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuffer lines = new StringBuffer();
			String line = "";
			for(line = br.readLine(); line != null; line = br.readLine()){
				lines.append(line);
			}
			return lines.toString();
		}catch(MalformedURLException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
}
