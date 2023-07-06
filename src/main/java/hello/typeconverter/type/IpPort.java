package hello.typeconverter.type;

import lombok.*;

@Getter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class IpPort {

    private String ip;
    private int port;

}
