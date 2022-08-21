class Solution {
    public:
void update(int id, int m, int * bit, int val) {
  while (id <= m) {
    bit[id] += val;
    id += (id & (-id));
  }
}
int getSum(int id, int * bit) {
  int sum = 0;
  while (id > 0) {
    sum += bit[id];
    id -= id & (-id);
  }
  return sum;
}
 int numTeams(vector<int> & rating) {
  int m = 100000;
  int bit[m + 1];
  int rbit[m + 1];
  memset(bit, 0, sizeof(bit));
  memset(rbit, 0, sizeof(rbit));

  int n = rating.size();
  if (n < 3)
    return 0;
  int i;
  for (i = n - 1; i >= 0; i--)
    update(rating[i], m, rbit, 1);

  int ans = 0;
  for (i = 0; i < n; i++) {
    update(rating[i], m, rbit, -1);

    int q1 = getSum(rating[i], bit);
    int q2 = getSum(m, rbit) - getSum(rating[i], rbit);

    ans += (q1 * q2);
    q1 = getSum(m, bit) - getSum(rating[i], bit);
    q2 = getSum(rating[i], rbit);
    ans += (q1 * q2);
    update(rating[i], m, bit, 1);
  }
  return ans;
}
    
};




