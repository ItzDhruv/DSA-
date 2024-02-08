public class Q_5_Holiday {
    public static void main(String[] args){
        Holiday holiday = new Holiday("Today",29,"March");
        Holiday holiday1 = new Holiday("Dhuleti",27,"March");
        Holiday holiday2 = new Holiday("Dhuleti",29,"March");
        System.out.println( holiday.inSameMonth(holiday1));
        System.out.println( holiday.inSameMonth(holiday2));
        Holiday[] holidayArray = {holiday, holiday1, holiday2};

//        double averageDate = Holiday.avgDate(holidayArray);

        System.out.println("Average date of holidays : " + Holiday.avgDate(holidayArray));
    }
}
class Holiday{
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public boolean inSameMonth(Holiday holiday){
        if(this.month == (holiday.month) && this.day == holiday.day){
            return true;
        }
        return false;
    }
    public static double avgDate(Holiday[] holidays){
        int totalDays = 0;
        for(int i = 0;i < holidays.length;i++){
            totalDays = totalDays + holidays[i].day;
        }
        return totalDays / holidays.length;
    }

}