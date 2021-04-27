package com.satanbakespancakes.russianlanguage;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class ThemesFragment extends Fragment {

    private RecyclerView rView;
    private ArrayList<Theme> themes = new ArrayList<>();

    public ThemesFragment() {
        // Required empty public constructor
    }

    public static ThemesFragment newInstance() {
        ThemesFragment fragment = new ThemesFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_themes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rView = (RecyclerView) view.findViewById(R.id.themes_chooser_recycler);
        DividerItemDecoration divider = new DividerItemDecoration(rView.getContext(), LinearLayoutManager.HORIZONTAL);
        rView.addItemDecoration(divider);
        initData();
        ThemesAdapter themesAdapter = new ThemesAdapter(view.getContext(), themes);
        rView.setAdapter(themesAdapter);
    }

    private void initData(){
        themes.add(new Theme("Проверяемые и непроверяемые гласные в корне слова",
                "Чтобы проверить безударную гласную в корне слова, нужно изменить слово или подобрать родственное так, чтобы на эту гласную падало ударение."));
        themes.add(new Theme("Чередование гласных в корнях слов -раст- -ращ- -рос-",
                "В корне перед согласными ст и щ пишется гласная а, а перед согласной с пишется гласная о. Растение, выращивать. Подрос, заросль. Исключения: отрасль, росток, выросток, ростовщик, Ростов."));
        themes.add(new Theme("Чередование гласных в корнях слов -скак- -скоч-",
                "Если гласная в корне безударная, то перед к пишется а, а перед ч — о. Прискака́л, Вы́скочка. Исключения: скачо́к, скачу́."));
        themes.add(new Theme("Чередование гласных в корнях слов -лаг- -лож-",
                "В корне перед г пишется а, а перед ж — о. Предполагать, прилагательное. Предложение, обложить. Исключение: по́лог"));
        themes.add(new Theme("Чередование гласных в корнях слов -равн- -ровн-",
                "В корне со значением «одинаковый, равный, сходный» пишется гласная а. В корне со значением «ровный, прямой» пишется гласная о. Сравнивать, уравнение, приравненный. Выровнять, ровно, подровнять."));
    }
}