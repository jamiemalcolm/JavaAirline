//package enums;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public enum DepartTimes {
//    MORNING("10:00"),
//    AFTERNOON("12:35"),
//    EVENING("17:00"),
//    SLEEPER("20:00");
//
//    private String time;
//
//    DepartTimes(String time){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
//        LocalDateTime LDTime = LocalDateTime.parse(time, formatter);
//        this.time = LDTime;
//    }
//
//
//    public LocalDateTime getTime() {
//        return this.time;
//    }
//}
