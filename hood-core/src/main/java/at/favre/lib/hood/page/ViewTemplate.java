package at.favre.lib.hood.page;


import android.support.annotation.ColorInt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface ViewTemplate<T> {

    int getViewType();

    View constructView(ViewGroup parent, LayoutInflater inflater);

    void setContent(T value, View view);

    void decorateViewWithZebra(View view, @ColorInt int zebraColor, boolean hasZebra);
}
