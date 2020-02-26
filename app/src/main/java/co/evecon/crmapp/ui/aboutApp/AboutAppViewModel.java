package co.evecon.crmapp.ui.aboutApp;

import android.content.Context;
import android.content.res.Resources;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import co.evecon.crmapp.R;

public class AboutAppViewModel extends ViewModel {

    private MutableLiveData<String> mText;


    public AboutAppViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}