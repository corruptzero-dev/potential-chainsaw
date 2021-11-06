package task;

import java.util.HashMap;

//TODO: реализация класса ImageFunctionsImpl.
//И уже эту реализацию использовать как лямбды
abstract class ImageFunctions {
    HashMap<Integer, Integer> frequency = new HashMap<>(); //<color, count>

    abstract int greyScale(int color) throws Exception;

    abstract int sepia(int color) throws Exception;

    abstract int inversion(int color) throws Exception;

    abstract int onlyRed(int color) throws Exception;

    abstract int onlyGreen(int color) throws Exception;

    abstract int onlyBlue(int color) throws Exception;

    abstract void fft(int color); //fill frequency map
}
