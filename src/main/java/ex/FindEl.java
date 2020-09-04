package ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] values = {
                "Hello", "World", "London", "The Capital"
        };
        int index = -1;
        try {
            index = indexOf(values, "Moscow");
        } catch (ElementNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println(index);
    }
}
