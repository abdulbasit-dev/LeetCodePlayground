### **📌 LeetCode Playground**
A structured Java project to solve **LeetCode problems**, categorized by difficulty (**Easy, Medium, Hard**). This project serves as a **coding playground** to test, debug, and organize solutions efficiently.

---

## **📂 Project Structure**
```
LeetCodePlayground/         # Root project folder
│── src/                    
│   ├── leetcode/           # Main package for LeetCode problems
│   │   ├── easy/           # Easy difficulty problems
│   │   │   ├── Problem1869.java  # Example problem
│   │   ├── medium/         # Medium difficulty problems
│   │   ├── hard/           # Hard difficulty problems
│   │   ├── utils/          # Utility functions
│   │   ├── Main.java       # Main test file
│── README.md               # Project documentation
│── .gitignore              # Ignore compiled files
│── pom.xml or build.gradle # If using Maven/Gradle (optional)
```

---

## **🚀 How to Use**
### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/your-username/LeetCodePlayground.git
cd LeetCodePlayground
```

### **2️⃣ Open in an IDE**
You can open this project in **IntelliJ IDEA**, **Eclipse**, or any Java-compatible IDE.

### **3️⃣ Run the `Main.java` File**
This file acts as a **test runner** for different problems.
```sh
javac src/leetcode/Main.java
java src/leetcode/Main
```
or run it directly from your IDE.

---

## **📌 Adding a New LeetCode Solution**
1️⃣ **Find the correct difficulty folder** (`easy/`, `medium/`, `hard/`).  
2️⃣ **Create a new class** named `Problem<Number>.java`  
3️⃣ **Implement your solution** inside the class.

Example:
📍 `src/leetcode/easy/Problem1869.java`
```java
package leetcode.easy;

public class Problem1869 {
    public boolean checkZeroOnes(String s) {
        int maxOnes = 0, maxZeros = 0, currentOnes = 0, currentZeros = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                currentOnes++;
                maxOnes = Math.max(maxOnes, currentOnes);
                currentZeros = 0;
            } else {
                currentZeros++;
                maxZeros = Math.max(maxZeros, currentZeros);
                currentOnes = 0;
            }
        }

        return maxOnes > maxZeros;
    }
}
```

---

## **📌 Utility Functions**
The `utils/` package contains helper functions that can be reused across different problems.

Example: **`ArrayUtils.java`**
📍 `src/leetcode/utils/ArrayUtils.java`
```java
package leetcode.utils;

import java.util.Arrays;

public class ArrayUtils {
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
```

Usage in **`Main.java`**:
```java
import leetcode.utils.ArrayUtils;

int[] numbers = {1, 2, 3, 4, 5};
ArrayUtils.printArray(numbers);  // Output: [1, 2, 3, 4, 5]
```

---

## **📌 Contributing**
Feel free to:
- Add new **LeetCode problems** with proper naming conventions.
- Improve **utility functions**.
- Optimize **existing solutions**.
- Report **issues or bugs**.

---

## **📌 License**
This project is open-source and available under the **MIT License**.

---

## **📌 Author**
Created by **[Abdulbasit Salah](https://github.com/abdulbasit-dev/)**.

---

### **🚀 Happy Coding!** 🎯

---