package com.example.tcu.checkinpro.employees;

public class employeeTrackDTO {

        public Integer employeeId;
        public String checkInTime;
        public String checkOutTime;
        public String checkInDate;
        public String checkOutDate;
        public String checkInLocation;
        public String checkOutLocation;
        public String position;

        public employeeTrackDTO(Integer employeeId, String checkInTime, String checkOutTime, String checkInDate, String checkOutDate, String checkInLocation, String checkOutLocation, String position) {
            this.employeeId = employeeId;
            this.checkInTime = checkInTime;
            this.checkOutTime = checkOutTime;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            this.checkInLocation = checkInLocation;
            this.checkOutLocation = checkOutLocation;
            this.position = position;
        }

        public Integer getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(Integer employeeId) {
            this.employeeId = employeeId;
        }

        public String getCheckInTime() {
            return checkInTime;
        }

        public void setCheckInTime(String checkInTime) {
            this.checkInTime = checkInTime;
        }

        public String getCheckOutTime() {
            return checkOutTime;
        }

        public void setCheckOutTime(String checkOutTime) {
            this.checkOutTime = checkOutTime;
        }

        public String getCheckInDate() {
            return checkInDate;
        }

        public void setCheckInDate(String checkInDate) {
            this.checkInDate = checkInDate;
        }

        public String getCheckOutDate() {
            return checkOutDate;
        }

        public void setCheckOutDate(String checkOutDate) {
            this.checkOutDate = checkOutDate;
        }

        public String getCheckInLocation() {
            return checkInLocation;
        }

        public void setCheckInLocation(String checkInLocation) {
            this.checkInLocation = checkInLocation;
        }

        public String getCheckOutLocation() {
            return checkOutLocation;
        }

        public void setCheckOutLocation(String checkOutLocation) {
            this.checkOutLocation = checkOutLocation;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }
}
