package rikkei.academy;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "D:\\MD2\\bai16\\ThucHanh\\ThucHanh2\\src\\rikkei\\academy\\file numbers.txt";
        String PATH_RESULT = "D:\\MD2\\bai16\\ThucHanh\\ThucHanh2\\src\\rikkei\\academy\\resunlt.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT, maxValue);
    }
}
