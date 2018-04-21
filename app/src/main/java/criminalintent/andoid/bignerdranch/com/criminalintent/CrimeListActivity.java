package criminalintent.andoid.bignerdranch.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by vi on 14/04/18.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
