package edu.norcocollege.cis18b.week6.mini02;

public class TypeInferenceUtilitiesDemo {

    public static <L, R> Pair<L, R> pair(L left, R right) {
        return new Pair<>(left, right);
    }

    public static <T> T chooseSecond(T first, T second) {
        return second;
    }
        // extension method 
        public static <T> T chooseNonNull(T first, T second) {
            if (first !=null) {
                return first;
            }
            if (second !=null) {
                return second;
            }
            throw new IllegalArgumentException("Both values cannot be null");
        }
    public static void main(String[] args) {
        Pair<String, Integer> studentScore = pair("Ada", 98);
        String secondName = chooseSecond("Ada", "Grace");
        // explicit typing is very useful when Java cannot infer the type! EX. such as when passing a null!
        String explicitValue = TypeInferenceUtilitiesDemo.<String>chooseSecond(null, "fallback");

        System.out.println("Pair: " + studentScore);
        System.out.println("Second name: " + secondName);
        System.out.println("Explicit value: " + explicitValue);
    }
}
