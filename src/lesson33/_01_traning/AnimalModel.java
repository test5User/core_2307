package lesson33._01_traning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class AnimalModel {
    private int id;
    private String name;
    private int age;
}
