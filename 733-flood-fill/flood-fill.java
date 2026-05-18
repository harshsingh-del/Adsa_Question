class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      int m = image.length;
      int n = image[0].length;
      int originalcolor = image[sr][sc];

      if(originalcolor == color){
        return image;
      }
    int[][] directions = {{-1,0},{1,0},{0,1},{0,-1}};
      Queue<int[]> q = new LinkedList<>();
      q.add(new int[]{sr,sc});
      image[sr][sc] = color;

      while(!q.isEmpty()){
        int curr[] = q.poll();
        int dx = curr[0];
        int dy = curr[1];
        for(int[]  dir : directions){
            int newdx = dx+dir[0];
            int newdy = dy+dir[1];

            if(newdx >= 0 && newdx < m && newdy >= 0 && newdy <n && image[newdx][newdy] == originalcolor){
                q.add(new int[]{newdx,newdy});
                image[newdx][newdy] = color;
            }
        }
      }

      return image;
    }
}