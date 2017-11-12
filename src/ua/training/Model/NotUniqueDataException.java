package ua.training.Model;

public class NotUniqueDataException extends Exception{
    private String data;

    public NotUniqueDataException(String message, String notUniqueData) {
        super(message + notUniqueData);
        this.data = notUniqueData;
    }
}
