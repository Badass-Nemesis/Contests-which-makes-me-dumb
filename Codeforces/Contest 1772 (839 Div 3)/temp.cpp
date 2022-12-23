#include <bits/stdc++.h>
using namespace std;
bool isArraySort(int arr[], int n, int mid)
{
    for (int i = 0; i < n - 1; i++)
    {
        int val1 = abs(arr[i] - mid);
        int val2 = abs(arr[i] - mid);
        if (val1 > val2)
        {
            return false;
        }
    }
    return true;
}
void solve()
{
    /*
        6
29613295 
52036613 
75100585 
78027446 
81409090 
73215
    */
    int n;
    cin >> n;
    int arr[n];
    int max1 = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
        max1 = max(max1, arr[i]);
    }
    bool flag = false;
    for (int i = 1; i < n; i++)
    {
        if (arr[i - 1] > arr[i])
        {
            flag = true;
            break;
        }
    }
    if (flag == false)
    {
        cout << "0" << endl;
        return;
    }
    int lo = 0;
    int hi = max1;
    //    cout<<max1<<endl;
    while (lo <= hi)
    {
        int mid = lo + (hi - lo) / 2;
        if (isArraySort(arr, n, mid))
        {
            cout << mid << endl;
            return;
        }
        else
        {
            lo = mid + 1;
        }
    }
    cout << "-1" << endl;
}

int main()
{
    int t;
    cin >> t;
    while (t > 0)
    {
        solve();
        t--;
    }
    return 0;
}