class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int [] c=new int[m+n];
        int i=0,j=0, k=0;
        while(i<m && j<n){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(i==m){
            while(j<n){
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(j==n){
            while(i<m){
                c[k]=a[i];
                i++;
                k++;

            }
        }
        for(int x=0;x<c.length;x++){
            a[x]=c[x];
        }
    }
}