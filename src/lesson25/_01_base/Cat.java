package lesson25._01_base;

import lombok.*;

@AllArgsConstructor
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Cat {
    @NonNull
    private String name;
    private Breed type;
    private int age;
}
