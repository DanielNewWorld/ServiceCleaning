package ua.in.cleaning.ui.publish;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PublishViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PublishViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}