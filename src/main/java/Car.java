import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@Data this annotation can be used instead of getter, setter, and toString

public class Car {

    private  int year;
    private int door;
    private String model;
    private  String make;
    private long vinNumber;
    private double motorSize;
}
