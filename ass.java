public class ass {
    void main() {
        int value = 8;
        value += 7;
        value -= 9;
        value *= 8;
        value %= 2;
        IO.println("result:%nvalue after adding:%d%nVALUE AFTER SUB:%d%nvalue after multi:%d%nafter using modulus value:%d%n"
                .formatted(value, value, value, value));
    }
}
