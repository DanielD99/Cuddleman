//TASK 01
//1.A

//arraylisten
int myArray[] = { 8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2 };

void setup() {
  int i=0;
  //så længe i < arraylængden + med 1
  while (i < myArray.length) {
    i++;
    //funktionen navngives
    sortArray();
  }
  println(myArray);
}
//funktion for vores sortArray
void sortArray() {
  for (int i=0; i < myArray.length - 1; i++) {
    if (myArray[i] > myArray[i + 1]) {
      swap(myArray, i,i+1);
    }
  }
}
//funktion for swap
void swap (int [] refArray, int arr, int arr1) {
  int temp = refArray[arr];
  refArray[arr] = refArray[arr1] ;
  refArray[arr1] = temp; 
}
