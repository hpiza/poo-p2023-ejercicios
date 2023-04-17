package tests;

import com.iteso.model.Buffer;
import com.iteso.model.GBuffer;
import com.iteso.model.RGBColor;

import java.math.BigInteger;

public class TestBuffer {

    public static void main(String[] args) {
        Buffer buffer1 = new Buffer();
        System.out.println(buffer1.store("A String in buffer"));
        System.out.println(buffer1.store("Another string in buffer"));
        String stringInBuffer = (String) buffer1.pop();
        System.out.println(stringInBuffer);

        System.out.println(buffer1.store(new RGBColor(150, 100, 200)));
        RGBColor colorInBuffer = (RGBColor) buffer1.pop();  // no es "type safety"
        System.out.println(colorInBuffer);

        GBuffer<String> stringBuffer = new GBuffer<>();
        stringBuffer.store("Otra cosa");
        // stringBuffer.store(new RGBColor(200, 150, 100));  Error de sintaxis (type safety)
        stringInBuffer = stringBuffer.peek();       // No se necesitó cast (type safety)
        System.out.println(stringInBuffer);

        GBuffer<RGBColor> colorBuffer = new GBuffer<>();
        colorBuffer.store(new RGBColor(200, 150, 100));
        colorInBuffer = colorBuffer.peek(); // No se necesitó cast (type safety)
        System.out.println(colorInBuffer);

        GBuffer<Integer> intBuffer = new GBuffer<Integer>();
        intBuffer.store(2023);  // Autoboxing: de int a Integer
        //intBuffer.store(3.5);
        int intInBuffer = intBuffer.peek();     // Auto-unboxing: de Integer a int
        System.out.println(intInBuffer);

        GBuffer<Number> numberBuffer = new GBuffer<>();
        numberBuffer.store(567_568.34);
        numberBuffer.store(-513_434f);
        numberBuffer.store(100_000_513_403_503L);
        numberBuffer.store((byte) 0x4F);
        numberBuffer.pop();
        numberBuffer.store(new BigInteger("1234567890000000000000000000"));
        Number n = numberBuffer.pop();   // No hay autoboxing con Number

        if(n instanceof BigInteger) {
            BigInteger BI1 = (BigInteger) n;
            BigInteger BI2 = BI1.multiply(BigInteger.valueOf(53));
            System.out.println(BI2);
        } else {
            System.out.println(n.doubleValue() * 2);
        }

        GBuffer<GBuffer<RGBColor>> colorBufferBuffer = new GBuffer<>();
        colorBufferBuffer.store(colorBuffer);

        //GBuffer<Object> objectBuffer = new GBuffer<>();
        GBuffer<GBuffer<?>> objectBuffer = new GBuffer<>(); // ? - wildcard, cajón de cajones de cualquier tipo de dato
        // objectBuffer.store("hola!!");
        objectBuffer.store(objectBuffer);
        objectBuffer.store(colorBuffer);

        System.out.println("Cajones actuales:");
        System.out.println(stringBuffer);
        System.out.println(colorBuffer);
        System.out.println(intBuffer);
        System.out.println(numberBuffer);
        System.out.println(colorBufferBuffer);
        System.out.println(objectBuffer);

    }

}
