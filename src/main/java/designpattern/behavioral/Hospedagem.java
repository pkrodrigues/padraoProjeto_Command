package designpattern.behavioral;

public class Hospedagem{
    private int roomNumber;
    private String roomDescription;
    private Boolean status;

    public Hospedagem(int roomNumber, String roomDescription) {
        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public boolean realizarChekin()
    {
        return this.status = true;
    }

    public boolean realizarChekout()
    {
        return this.status = false;
    }
}
