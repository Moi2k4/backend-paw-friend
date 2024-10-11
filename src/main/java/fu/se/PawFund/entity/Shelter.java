//package fu.se.PawFund.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Shelter {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int shelterId;
//    private String shelterName;
//    private String shelterStaff;
//    private String phone;
//    private String address;
//    private int available;
//
//    public Shelter() {
//    }
//
//    public Shelter(int shelterId, String shelterName, String shelterStaff, String phone, String address, int available) {
//        this.shelterId = shelterId;
//        this.shelterName = shelterName;
//        this.shelterStaff = shelterStaff;
//        this.phone = phone;
//        this.address = address;
//        this.available = available;
//    }
//
//    public int getShelterId() {
//        return shelterId;
//    }
//
//    public void setShelterId(int shelterId) {
//        this.shelterId = shelterId;
//    }
//
//    public String getShelterName() {
//        return shelterName;
//    }
//
//    public void setShelterName(String shelterName) {
//        this.shelterName = shelterName;
//    }
//
//    public String getShelterStaff() {
//        return shelterStaff;
//    }
//
//    public void setShelterStaff(String shelterStaff) {
//        this.shelterStaff = shelterStaff;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getAvailable() {
//        return available;
//    }
//
//    public void setAvailable(int available) {
//        this.available = available;
//    }
//}
