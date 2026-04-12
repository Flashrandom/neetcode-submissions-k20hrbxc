class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
// adding k elements in then min heap 
        for( int i=0; i<k; i++){
            minHeap.offer(nums[i]);
        }
// adding and removing them eklements from minheap to make minheap of k largest elements in it 
        for( int i=k; i<nums.length; i++){
            if( nums[i] > minHeap.peek()){

                minHeap.poll();
                minHeap.offer(nums[i]);

            }
        }
        return minHeap.peek(); /// at head it is the kth largest element
    }
}
