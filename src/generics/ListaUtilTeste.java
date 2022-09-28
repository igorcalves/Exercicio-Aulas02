package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {

        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ulltimaLinguagem = (String) listUtil.getUltimo1(langs);
        System.out.println(ulltimaLinguagem);

        Integer ultimoNumero = (Integer) listUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);

        String ulltimaLinguagem2 = listUtil.getUltimo2(langs);
        System.out.println(ulltimaLinguagem2);

        Integer ultimoNumero2 = listUtil.getUltimo2(nums);
        System.out.println(ultimoNumero2);

    }
}
