import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //todo создайте класс Wine. Протестируйте его работу в этом методе.

        Date data = new Date();
        data.getTime();
        System.out.println(data);


        Wine isabella = new Wine("krasnoe","13",0.7,
                "isabelka","abraudurso","France",
                LocalDate.of(2001, 9, 21),"kracnoe v zelenom stekle");

        isabella.winePeriod(LocalDate.now());

        isabella.winePeriod(LocalDate.of(2010, 3, 13));


        Wine korona = new Wine("red","11", 0.8,
                "korona", "serafima", "RUS",
                LocalDate.of(2013, 9,11), "da prosto v stekle");

        korona.winePeriod(LocalDate.now());

    }
}