class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       int n = image.length;
       for(int i = 0; i < n; i++){
        rev(image[i]);
        for(int j = 0; j < n; j++){
            image[i][j] = (image[i][j] == 1) ? 0 : 1;
        }
       }
       return image;
        
    }

    public static void rev(int[] image){
        int i = 0;
        int j = image.length - 1;
        while(j > i){
            int temp = image[i];
            image[i] = image[j];
            image[j] = temp;
            i++;
            j--;
        }
    }
}