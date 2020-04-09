package jmac.application.favoritemovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView reciclerView;
    private RecyclerView.Adapter adapter;
    private List< ListItem > listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reciclerView = (RecyclerView) findViewById(R.id.reciclerView);
        reciclerView.setHasFixedSize(true);
        //every item has a fixed size
        reciclerView.setLayoutManager(new
                LinearLayoutManager (this));

        listItems = new ArrayList <> ();

        ListItem item1 = new ListItem ( "Mission Impossible Fallout", "Mission Impossible Fallout" , "Ethan Hunt and his IMF team, along with some familiar allies, race against time after a mission gone wrong.");
        ListItem item2 = new ListItem ( "Movie 2", "The Bourne Ultimatum", "Jason Bourne dodges a ruthless C.I.A. official and his Agents from a new assassination program while searching for the origins of his life as a trained killer.");
        ListItem item3 = new ListItem ( "Movie 3", "Die Hard", "An NYPD officer tries to save his wife and several others taken hostage by German terrorists during a Christmas party at the Nakatomi Plaza in Los Angeles.");
        ListItem item4 = new ListItem ( "Movie 4", "Fist of Fury", "A young man seeks vengence for the death of his teacher.");
        ListItem item5 = new ListItem ( "Movie 5", "Aliens", "Ellen Ripley is rescued by a deep salvage team after being in hypersleep for 57 years. The moon that the Nostromo visited has been colonized, but contact is lost. This time, colonial marines have impressive firepower, but will that be enough?");
        ListItem item6 = new ListItem ( "Movie 6", "Mission: Impossible - Ghost Protocol", "The IMF is shut down when it's implicated in the bombing of the Kremlin, causing Ethan Hunt and his new team to go rogue to clear their organization's name.");
        ListItem item7 = new ListItem ( "Movie 7", "Pulp Fiction", "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.");
        ListItem item8 = new ListItem ( "Movie 8", "Mrs. Doubtfire", "After a bitter divorce, an actor disguises himself as a female housekeeper to spend time with his children held in custody by his former wife.");
        ListItem item9 = new ListItem ( "Movie 9", "The Warriors", "In the near future, a charismatic leader summons the street gangs of New York City in a bid to take it over. When he is killed, The Warriors are falsely blamed and now must fight their way home while every other gang is hunting them down.");
        ListItem item10 = new ListItem ( "Movie 10", "Enter the Dragon", "A martial artist agrees to spy on a reclusive crime lord using his invitation to a tournament there as cover.");

       // for (int i = 0; i<10; i++) {
            //ListItem listItem = new ListItem(
                 // "Item " + (i+1),
                 // "Description",
                  // "Excellent"

         // );
            listItems.add(item1);
            listItems.add(item2);
            listItems.add(item3);
            listItems.add(item4);
            listItems.add(item5);
            listItems.add(item6);
            listItems.add(item7);
            listItems.add(item8);
            listItems.add(item9);
            listItems.add(item10);
       // }

        adapter = new MyAdapter (this, listItems);

        reciclerView.setAdapter(adapter);

    }
}
