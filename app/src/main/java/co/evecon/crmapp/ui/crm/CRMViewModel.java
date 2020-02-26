package co.evecon.crmapp.ui.crm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CRMViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CRMViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is CRM fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}