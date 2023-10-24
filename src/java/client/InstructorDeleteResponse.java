/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

/**
 *
 * @author aefilms
 */
public class InstructorDeleteResponse {
    
    private String message;
    private String timeStamp;

    public InstructorDeleteResponse() {
    }

    public InstructorDeleteResponse(String message, String timeStamp) {
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "InstructorDeleteResponse{" + "message=" + message + ", timeStamp=" + timeStamp + '}';
    }
    
    
    
}
