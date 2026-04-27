package chap12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private String id;
    @NonNull  // 필수 항목 -> @RequiredArgsConstructor에 의해 생성자 추가됨.
    private String name;
    private int age;
}


// 생성된 코드 확인
// - Structure 아이콘 클릭 또는 Alt + 7
