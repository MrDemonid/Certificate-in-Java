import java.util.ArrayList;

/*
 * Сделан исключительно для удобства, позволяет немного сократить код.
 * Вообще же это позволило бы внедрить методы по обработке номеров телефонов,
 * например изъять на входе всё лишнее и привести к какому-то единому формату.
 */
public class Phone extends ArrayList<String> {

    public Phone(String phoneNum)
    {
        super();
        add(phoneNum);
    }
}
