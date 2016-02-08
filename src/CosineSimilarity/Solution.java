package CosineSimilarity;

//Cosine similarity is a measure of similarity between two vectors of an inner product space that measures the cosine of the angle between them. The cosine of 0бу is 1, and it is less than 1 for any other angle.
//See wiki: Cosine Similarity
//
//Given two vectors A and B with the same size, calculate the cosine similarity.
//Return 2.0000 if cosine similarity is invalid (for example A = [0] and B = [0]).

class Solution {
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    public double cosineSimilarity(int[] A, int[] B) {
        // write your code here
    	if(A.length>0 && B.length>0){
            double numerator = 0;
            double aa=0,bb=0;
            for(int i=0;i<A.length;i++){
                numerator += A[i]*B[i];
                aa += A[i]*A[i];
                bb += B[i]*B[i];
            }
            double denominator = Math.sqrt(aa)*Math.sqrt(bb);
            if(denominator != 0){
                return numerator/denominator;
            }
        }
        return 2.0000;
    }
}