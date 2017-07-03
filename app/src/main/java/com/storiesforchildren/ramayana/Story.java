package com.storiesforchildren.ramayana;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Alok on 03/07/17.
 */

public class Story implements Parcelable {

    private int imageDrawable;
    private String story;

    public Story(int imageDrawable, String story) {
        this.imageDrawable = imageDrawable;
        this.story = story;
    }

    public int getImageDrawable() {
        return imageDrawable;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Story story1 = (Story) o;

        if (imageDrawable != story1.imageDrawable) return false;
        return story != null ? story.equals(story1.story) : story1.story == null;

    }

    @Override
    public int hashCode() {
        int result = imageDrawable;
        result = 31 * result + (story != null ? story.hashCode() : 0);
        return result;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.imageDrawable);
        dest.writeString(this.story);
    }

    public Story() {
    }

    protected Story(Parcel in) {
        this.imageDrawable = in.readInt();
        this.story = in.readString();
    }

    public static final Parcelable.Creator<Story> CREATOR = new Parcelable.Creator<Story>() {
        @Override
        public Story createFromParcel(Parcel source) {
            return new Story(source);
        }

        @Override
        public Story[] newArray(int size) {
            return new Story[size];
        }
    };

    public static ArrayList<Story> getStoryList() {
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story(R.drawable.ramayana1, "To the north of the Ganga was the great kingdom Kosala, made fertile by the river Sarayu. Its capital was Ayodhya, built by Manu, the famous ruler of the Solar dynasty. From Valmiki's description of the capital Kosala, it is clear that ancient Ayodhya was not inferior to our modern cities. Even in ancient India city civilisation had reached a high level.\n" +
                "King Dasaratha ruled the kingdom from the capital city of Ayodhya. He had fought on the side of the Devas, and his fame spread in the three worlds. He was the equal of Indra and Kubera. The people of Kosala were happy, contented and virtuous. The land was protected by a mighty army, and no enemy could come anywhere near\n" +
                "It contained forts with moats around them as well as many defensive intallations, and true to its name, Ayodhya defied all enemies. (Ayodhya means that which cannot be subdued by war). Dasaratha had eight wise ministers, ever ready to advise him and execute his orders. Great sages like Vasishtha and Vamadeva and other Brahmanas taught the dharma and performed rituals and sacrifices.\n" +
                "Taxes were light and punishment of crime was just and inflicted according to the capacity of the wrong-doer. Surrounded by the best counsellors and statesmen, the king's splendor shone as the rising sun. Many years rolled smoothly by. In the midst of all this prosperity Dasaratha had one regret; he had no son.\n" +
                "One day in early summer he thought of performing a horse sacrifice for progeny. He consulted his religious masters and on their advice, got sage Rishyasringa to perform the Yaga. The Yaga was a grand affair and the invitees included many of the kings of the day. It was no easy thing to perform yagas. The location and erection of the sacrificial platform had to be attended to in detail strictly according to prescribed rules. There were experts whose guidance was sought in arranging things."));
        stories.add(new Story(R.drawable.ramayana2, "It meant the building of a new camp- city, capable of accommodating tens of thousands and providing hospitality and entertainment for the invitees who included the princes and sages of the land. In short, yagas in those days were something like our present-day State- sponsored big scale conferences and exhibitions.\n" +
                "When all arrangements were complete the ceremonies were set in motion strictly as enjoined by the Shastras.\n" +
                "Contemporaneously with the yaga in Ayodhya, there was a conference of the Devas in heaven. The Devas complained to Lord Brahma that Ravana, king of the demons, drunk with the power acquired by the boon granted to him by Brahma, was causing them untold misery and hardship. They represented to Brahma: \"It is beyond our capacity to subdue, conquer or kill Ravana. In the security of your boon, he has grown wicked and insolent and ill-treats all, even women. His desire is to dethrone Indra. You are our only\n" +
                "refuge and it is for you to devise a method by which Ravana can be slain and his despotism ended.\""));
        stories.add(new Story(R.drawable.ramayana3, "Brahma knew that he had granted to\n" +
                "Ravana the boon prayed for by him that\n" +
                "he should be invulnerable and invincible\n" +
                "against Devas, Asuras, Gandharvas and\n" +
                "other such beings. In his arrogance,\n" +
                "Ravana did not care to ask for security\n" +
                "against mankind. As Brahma revealed this\n" +
                "fateful omission all the Gods rejoiced and\n" +
                "turned to Vishnu.\n" +
                "Absolutely surrendering themselves to\n" +
                "Hari, the Devas begged him to be born as\n" +
                "a man and put an end to Ravana and his\n" +
                "atrocities. Hari agreed and assured the\n" +
                "Devas that he would be born as four sons\n" +
                "of King Dasaratha who was then\n" +
                "performing a sacrifice for progeny. As the\n" +
                "ghee was poured into the fire and the\n" +
                "flames shot up to meet it, from out of the\n" +
                "flames came a majestic figure, resplendent\n" +
                "like the noonday sun, holding a bowl of\n" +
                "gold.\n" +
                "Calling King Dasaratha by his name,\n" +
                "the figure said: \"The Devas are pleased\n" +
                "with you and are answering your prayer.\n" +
                "Here is payasam sent by the gods for your\n" +
                "wives. You will be blessed with sons if\n" +
                "they drink this divine beverage.\" With joy\n" +
                "unbounded, Dasaratha received the bowl\n" +
                "as he would receive a child and distributed\n" +
                "the payasam to his three wives, Kausalya,\n" +
                "Sumitra and Kaikeyi.\n" +
                "He asked Kausalya to drink a half of\n" +
                "the payasam and he gave a half of what\n" +
                "remained to Sumitra. Half of what was\n" +
                "then lift was drunk by Kaikeyi, and what\n" +
                "remained was given to Sumitra again.\n" +
                "Dasaratha's wives were happy, even as a\n" +
                "beggar suddenly coming upon buried\n" +
                "treasure. And in due course all of them\n" +
                "were expectant mothers."));
        return stories;
    }
}
