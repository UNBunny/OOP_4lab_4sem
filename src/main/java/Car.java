import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Serializable {
    private String make;
    private String model;
    private String engine;
    private int year;
    private String transmission;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", year=" + year +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
