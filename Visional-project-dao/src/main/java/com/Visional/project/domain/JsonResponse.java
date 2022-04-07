package com.Visional.project.domain;

public class JsonResponse<T> {

    private String code;

    private String msg;

    private T data;

    public JsonResponse(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public JsonResponse(T data){
        this.data = data;
        msg = "Successful";
        code = "0"; // status code
    }

    //Don't need to return to frontend: For situation when request success
    public static JsonResponse<String> success(){
        return new JsonResponse<>(null);
    }

    //Need to return to frontend: For situation when user login, system return a token to user, input token as parameter
    public static JsonResponse<String> success(String data){
        return new JsonResponse<>(data);
    }

    // When request failed, return information to frontend
    public static JsonResponse<String> fail(String data){
        return new JsonResponse<>("1", "Fail");
    }

    // When request failed and status code is something else
    public static JsonResponse<String> fail(String code, String msg){
        return new JsonResponse<>(code, msg);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
