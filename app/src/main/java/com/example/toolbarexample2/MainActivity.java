package com.example.toolbarexample2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {
   private ImageButton ibMenu;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      ibMenu = findViewById(R.id.ibMenu);

      ibMenu.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            onClickButton(view);
         }
      });
   }

   public void showMenu(View v) {
      PopupMenu popup = new PopupMenu(v.getContext(), v);
      popup.setOnMenuItemClickListener(item -> {
         int id = item.getItemId();
         if (id == R.id.menu_share) {

         } else if (id == R.id.menu_info) {

         } else if (id == R.id.menu_rename) {

         } else if (id == R.id.menu_open_with) {

         } else if (id == R.id.menu_save_as) {

         } else if (id == R.id.menu_delete) {

         }
         return false;
      });
      
      MenuInflater inflater = popup.getMenuInflater();
      inflater.inflate(R.menu.example_menu, popup.getMenu());
      Utils.insertMenuItemIcons(v.getContext(), popup);
      popup.show();
   }

   public void onClickButton(View view) {
      int id = view.getId();
      if (id == R.id.ibMenu) {
         showMenu(view);
      }
   }
}