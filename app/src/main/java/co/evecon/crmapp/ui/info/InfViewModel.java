package co.evecon.crmapp.ui.info;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InfViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InfViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is information fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}