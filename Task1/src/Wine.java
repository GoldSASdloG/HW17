import java.time.LocalDate;
import java.time.Period;

public class Wine {

//    Продумайте, какие поля и методы понадобятся классу Wine,
//    для выполнения следующих функций: 1. Хранение информации
//    о виде вина: название, торговая марка, страна, дата разлива,
//    описание. 2. Доступ (установка и получение значений) к
//    хранимой информации. 3. Расчёт выдержки вина в годах
//    (текущая дата даётся как аргумент). В классе Main протестируйте
//    работу вашего класса.

    private String color;
    private String gradus;
    private double volume;
    private String wineName;
    private String markaName;
    private String countryName;
    private LocalDate date;
    private String description;

    public Wine() {
    }

    public Wine(String color, String gradus, double volume,
                String wineName, String markaName, String countryName,
                LocalDate date, String description) {
        this.color = color;
        this.gradus = gradus;
        this.volume = volume;
        this.wineName = wineName;
        this.markaName = markaName;
        this.countryName = countryName;
        this.date = date;
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGradus() {
        return gradus;
    }

    public void setGradus(String gradus) {
        this.gradus = gradus;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getWineName() {
        return wineName;
    }

    public void setWineName(String wineName) {
        this.wineName = wineName;
    }

    public String getMarkaName() {
        return markaName;
    }

    public void setMarkaName(String markaName) {
        this.markaName = markaName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void winePeriod(LocalDate now){
        int years = 0;
        years= Period.between(date, now).getYears();

        System.out.println("Выдержка вина составляет " + years + " лет");
    }
}
