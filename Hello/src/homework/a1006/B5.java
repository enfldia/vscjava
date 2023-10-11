package homework.a1006;

public class B5 {
    public static void main(String[] args) {
        int[][] array1 = { { 1, 2 }, { 3, 4 } };
        int[][] array2 = { { 5, 6 }, { 7, 8 } };
        int[][] mergedArray = mergeArrays(array1, array2);

        //결과를 출력
        for(int[] row:mergedArray){
            for(int element:row){
                System.out.println(element+" "); 
            }
            System.out.println();
        }
    }

    public static int[][] mergeArrays (int[][] array1, int[][] array2){
    int numRows = array1.length + array2.length;
    int numCols = array1[0].length; //두배열은 동일한 열 수여야 한다.
    int[][] mergedArray = new int[numRows][numCols];

    for (int i = 0; i < array1.length; i++) {
        for (int j = 0; j < numCols; j++) {
            mergedArray[i][j] = array1[i][j];
        }
    }
    for (int i = 0; i < array2.length; i++) {
        for (int j = 0; j < numCols; j++) {
            mergedArray[i + array1.length][j] = array2[i][j];
        }
    }

    return mergedArray;
    }

}

/*
 * 문제 5: 2차원 배열 합치기
 * 
 * 두 개의 2차원 배열을 "세로로 합치는 것"은 두 배열을 위 아래로 연결하여 새로운 2차원 배열을 만드는 작업을 의미합니다. 이것은 다음과
 * 같은 상황에서 유용할 수 있습니다:
 * 
 * 두 개의 2차원 배열이 있고, 각 배열의 열 수는 같지만 행 수가 다를 때, 두 배열을 세로로 합쳐서 더 큰 배열을 만들 수 있습니다.
 * 
 * 두 개의 2차원 배열을 세로로 합치면, 각 배열의 열은 그대로 유지되고 행이 연결됩니다. 이렇게 합쳐진 배열은 두 배열의 데이터를 하나로
 * 결합한 것과 같습니다.
 * 
 * 예를 들어, 다음과 같은 두 개의 2차원 배열이 있다고 가정해 봅시다:
 * 
 * java
 * Copy code
 * int[][] array1 = {{1, 2}, {3, 4}};
 * int[][] array2 = {{5, 6}, {7, 8}};
 * 이 두 배열을 세로로 합치면 다음과 같은 결과가 나옵니다:
 * 
 * java
 * Copy code
 * int[][] mergedArray = mergeArrays(array1, array2);
 * mergedArray는 다음과 같은 형태를 가집니다:
 * 
 * Copy code
 * {{1, 2}, {3, 4}, {5, 6}, {7, 8}}
 * 즉, 두 배열의 열은 그대로 유지되고, 행이 연결되어 새로운 2차원 배열이 생성됩니다. 이렇게 세로로 합치면 두 배열의 데이터를 결합하여
 * 사용할 수 있습니다.
 */