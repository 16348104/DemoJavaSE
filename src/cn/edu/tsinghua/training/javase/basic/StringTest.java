package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/30.
 */
public class StringTest {

    public static void main(String[] args) {
        String s = "hello";
        String s1 = "hello";

        System.out.println(s);
        System.out.println(s1);

        System.out.println(s == s1);

        System.out.println(s.equals(s1));

        System.out.println(s.indexOf('l'));

        System.out.println(s.isEmpty());

        System.out.println(s.matches("[A-z]+")); // regex regular expression 正则表达式

        System.out.println(s.replace('l', 'a'));
        System.out.println(s.replace("he", "ab"));
        System.out.println(s.replaceAll("[A-z]+", "123"));

        String s2 = "he ll o";
        String[] strings = s2.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }

        String s3 = "a\n" +
                "a bill of fare\n" +
                "a case in point\n" +
                "a couple of\n" +
                "a far cry\n" +
                "a few\n" +
                "a good deal\n" +
                "a good few\n" +
                "a good many\n" +
                "a hard nut to crack\n" +
                "a little\n" +
                "a lot of\n" +
                "a number of\n" +
                "a point of view\n" +
                "a series of\n" +
                "a variety of\n" +
                "a.m\n" +
                "abandon\n" +
                "ability\n" +
                "able\n" +
                "abnormal\n" +
                "aboard\n" +
                "abound in\n" +
                "about\n" +
                "above\n" +
                "above all\n" +
                "abroad\n" +
                "absence\n" +
                "absent\n" +
                "absolute\n" +
                "absolutely\n" +
                "absorb\n" +
                "abstract\n" +
                "abundant\n" +
                "abuse\n" +
                "academic\n" +
                "academy\n" +
                "accelerate\n" +
                "acceleration\n" +
                "accent\n" +
                "accept\n" +
                "acceptable\n" +
                "acceptance\n" +
                "access\n" +
                "accessary\n" +
                "accident\n" +
                "accidental\n" +
                "accommodate\n" +
                "accommodation\n" +
                "accompany\n" +
                "accomplish\n" +
                "accord\n" +
                "accordance\n" +
                "according as\n" +
                "according to\n" +
                "accordingly\n" +
                "account\n" +
                "account for\n" +
                "accumulate\n" +
                "accuracy\n" +
                "accurate\n" +
                "accuse\n" +
                "accuse sb. of sth.\n" +
                "accustom\n" +
                "accustomed\n" +
                "ache\n" +
                "achieve\n" +
                "achievement\n" +
                "acid\n" +
                "acquaintance\n" +
                "acquire\n" +
                "acre\n" +
                "across\n" +
                "act\n" +
                "act for\n" +
                "act on\n" +
                "act out\n" +
                "action\n" +
                "active\n" +
                "activity\n" +
                "actor\n" +
                "actress\n" +
                "actual\n" +
                "actually\n" +
                "acute\n" +
                "ad\n" +
                "adapt\n" +
                "adapt to\n" +
                "add\n" +
                "add up\n" +
                "add up to\n" +
                "addition\n" +
                "additional\n" +
                "address\n" +
                "adequate\n" +
                "adhere to\n" +
                "adjective\n" +
                "adjust\n" +
                "administration\n" +
                "admire\n" +
                "admire to do sth.\n" +
                "admission\n" +
                "admit\n" +
                "admit of\n" +
                "admit to\n" +
                "adopt\n" +
                "adult\n" +
                "advance\n" +
                "advanced\n" +
                "advantage\n" +
                "adventure\n" +
                "adverb\n" +
                "advertise for\n" +
                "advertisement\n" +
                "advice\n" +
                "advisable\n" +
                "advise\n" +
                "aeroplane\n" +
                "affair\n" +
                "affect\n" +
                "affect to\n" +
                "affection\n" +
                "afford\n" +
                "afford to\n" +
                "afraid\n" +
                "Africa\n" +
                "African\n" +
                "after\n" +
                "after a little\n" +
                "after a while\n" +
                "after all\n" +
                "afternoon\n" +
                "afterward\n" +
                "again\n" +
                "against\n" +
                "age\n" +
                "agency\n" +
                "agent\n" +
                "aggressive\n" +
                "ago\n" +
                "agony\n" +
                "agree\n" +
                "agree on\n" +
                "agree to\n" +
                "agree with\n" +
                "agreement\n" +
                "agriculture\n" +
                "ahead\n" +
                "ahead of\n" +
                "ahead of schedule\n" +
                "ahead of time\n" +
                "aid\n" +
                "aim\n" +
                "aim for\n" +
                "air\n" +
                "aircraft\n" +
                "airline\n" +
                "airplane\n" +
                "airport\n" +
                "alarm\n" +
                "alcohol\n" +
                "alike\n" +
                "alive\n" +
                "all\n" +
                "all along\n" +
                "all at once\n" +
                "all but\n" +
                "all in all\n" +
                "all of a sudden\n" +
                "all one's life\n" +
                "all out\n" +
                "all over\n" +
                "all over again\n" +
                "all right\n" +
                "all round\n" +
                "all the same\n" +
                "all the time\n" +
                "all the years round\n" +
                "all too\n" +
                "allow\n" +
                "allow for\n" +
                "allow of\n" +
                "alloy\n" +
                "almost\n" +
                "alone\n" +
                "along\n" +
                "along with\n" +
                "aloud\n" +
                "alphabet\n" +
                "already\n" +
                "also\n" +
                "alter\n" +
                "alternative\n" +
                "although\n" +
                "altitude\n" +
                "altogether\n" +
                "aluminium\n" +
                "always\n" +
                "amaze\n" +
                "ambition\n" +
                "ambulance\n" +
                "America\n" +
                "American\n" +
                "among\n" +
                "amongst\n" +
                "amount\n" +
                "amount to\n" +
                "ampere\n" +
                "amplify\n" +
                "amuse\n" +
                "analyse\n" +
                "analysis\n" +
                "ancestor\n" +
                "anchor\n" +
                "ancient\n" +
                "and\n" +
                "and all that\n" +
                "and so\n" +
                "and so forth\n" +
                "and so on\n" +
                "and that\n" +
                "and the like\n" +
                "and then\n" +
                "and what not\n" +
                "and yet\n" +
                "angel\n" +
                "anger\n" +
                "angle\n" +
                "angry\n" +
                "animal\n" +
                "ankle\n" +
                "announce\n" +
                "announcer\n" +
                "annoy\n" +
                "annual\n" +
                "another\n" +
                "answer\n" +
                "answer for\n" +
                "answer sb. back\n" +
                "answer up\n" +
                "ant\n" +
                "anticipate\n" +
                "anxiety\n" +
                "anxious\n" +
                "any\n" +
                "any longer\n" +
                "any more\n" +
                "any number of\n" +
                "anybody\n" +
                "anyhow\n" +
                "anyone\n" +
                "anything\n" +
                "anything but\n" +
                "anyway\n" +
                "anywhere\n" +
                "apart\n" +
                "apart from\n" +
                "apartment\n" +
                "apologize\n" +
                "apology\n" +
                "apparatus\n" +
                "apparent\n" +
                "appeal\n" +
                "appeal to\n" +
                "appear\n" +
                "appearance\n" +
                "appetite\n" +
                "apple\n" +
                "appliance\n" +
                "applicable\n" +
                "application\n" +
                "apply\n" +
                "apply for\n" +
                "apply oneself to\n" +
                "apply...to\n" +
                "appoint\n" +
                "appointment\n" +
                "appreciate\n" +
                "approach\n" +
                "appropriate\n" +
                "approval\n" +
                "approve\n" +
                "approve of\n" +
                "approximate\n" +
                "approximately\n" +
                "April\n" +
                "Arabian\n" +
                "arbitrary\n" +
                "architecture\n" +
                "area\n" +
                "argue\n" +
                "argument\n" +
                "arise\n" +
                "arithmetic\n" +
                "arm\n" +
                "arm in arm\n" +
                "army\n" +
                "around\n" +
                "arouse\n" +
                "arrange\n" +
                "arrangement\n" +
                "arrest\n" +
                "arrival\n" +
                "arrive\n" +
                "arrive at\n" +
                "arrow\n" +
                "art\n" +
                "article\n" +
                "artificial\n" +
                "artist\n" +
                "artistic\n" +
                "as\n" +
                "as a matter of fact\n" +
                "as a result\n" +
                "as a result of\n" +
                "as a rule\n" +
                "as a whole\n" +
                "as best one can\n" +
                "as concerns\n" +
                "as far as\n" +
                "as follows\n" +
                "as for\n" +
                "as for as\n" +
                "as good as\n" +
                "as if\n" +
                "as it is\n" +
                "as it were\n" +
                "as long as\n" +
                "as much as\n" +
                "as regards\n" +
                "as soon as\n" +
                "as soon as possible\n" +
                "as sure as fate\n" +
                "as to\n" +
                "as usual\n" +
                "as well\n" +
                "as well as\n" +
                "as yet\n" +
                "as...as...\n" +
                "ash\n" +
                "ashamed\n" +
                "Asia\n" +
                "Asian\n" +
                "aside\n" +
                "aside from\n" +
                "ask\n" +
                "ask after\n" +
                "ask for\n" +
                "asleep\n" +
                "aspect\n" +
                "assemble\n" +
                "assembly\n" +
                "assess\n" +
                "assign\n" +
                "assignment\n" +
                "assist\n" +
                "assist in\n" +
                "assist sb. with sth.\n" +
                "assistant\n" +
                "associate\n" +
                "association\n" +
                "assume\n" +
                "assure\n" +
                "assure sb. of sth.\n" +
                "astonish\n" +
                "astronaut\n" +
                "at\n" +
                "at a good pace\n" +
                "at a loss\n" +
                "at a speed of\n" +
                "at a time\n" +
                "at all\n" +
                "at all costs\n" +
                "at all events\n" +
                "at all risks\n" +
                "at all times\n" +
                "at any cost\n" +
                "at any rate\n" +
                "at any time\n" +
                "at best\n" +
                "at ease\n" +
                "at first\n" +
                "at first sight\n" +
                "at full speed\n" +
                "at hand\n" +
                "at heart\n" +
                "at home\n" +
                "at intervals\n" +
                "at large\n" +
                "at last\n" +
                "at least\n" +
                "at length\n" +
                "at longest\n" +
                "at lowest\n" +
                "at most\n" +
                "at night\n" +
                "at no time\n" +
                "at once\n" +
                "at one time\n" +
                "at one's best\n" +
                "at other times\n" +
                "at peace\n" +
                "at present\n" +
                "at regular intervals\n" +
                "at sb.'s disposal\n" +
                "at sb.'s heels\n" +
                "at sight of\n" +
                "at table\n" +
                "at that\n" +
                "at that rate\n" +
                "at the cost of\n" +
                "at the expense of\n" +
                "at the latest\n" +
                "at the mercy of\n" +
                "at the moment\n" +
                "at the same time\n" +
                "at this rate\n" +
                "at times\n" +
                "at work\n" +
                "at worst\n" +
                "athlete\n" +
                "Atlantic\n" +
                "atmosphere\n" +
                "atmospheric\n" +
                "atom\n" +
                "atomic\n" +
                "attach\n" +
                "attach importance to\n" +
                "attach oneself to\n" +
                "attach to\n" +
                "attack\n" +
                "attain\n" +
                "attain to\n" +
                "attempt\n" +
                "attend\n" +
                "attend on\n" +
                "attend to\n" +
                "attention\n" +
                "attentive\n" +
                "attitude\n" +
                "attract\n" +
                "attraction\n" +
                "attractive\n" +
                "attribute\n" +
                "audience\n" +
                "August\n" +
                "aunt\n" +
                "aural\n" +
                "Australia\n" +
                "Australian\n" +
                "author\n" +
                "authority\n" +
                "auto\n" +
                "automatic\n" +
                "automation\n" +
                "automobile\n" +
                "autumn\n" +
                "auxiliary\n" +
                "available\n" +
                "avenue\n" +
                "average\n" +
                "aviation\n" +
                "avoid\n" +
                "await\n" +
                "awake\n" +
                "award\n" +
                "aware\n" +
                "away\n" +
                "awful\n" +
                "awfully\n" +
                "awkward\n" +
                "ax\n" +
                "axis\n" +
                "B.C.\n" +
                "baby\n" +
                "back\n" +
                "back and forth\n" +
                "back away\n" +
                "back of\n" +
                "back up\n" +
                "background\n" +
                "backward\n" +
                "bacteria\n" +
                "bad\n" +
                "badly\n" +
                "badminton\n" +
                "bag\n" +
                "baggage\n" +
                "bake\n" +
                "balance\n" +
                "ball\n" +
                "balloon\n" +
                "banana\n" +
                "band\n" +
                "bang\n" +
                "bank\n" +
                "banner\n" +
                "bar\n" +
                "barber\n" +
                "bare\n" +
                "bargain\n" +
                "bark\n" +
                "barn\n" +
                "barrel\n" +
                "barrier\n" +
                "base\n" +
                "based on\n" +
                "basic\n" +
                "basically\n" +
                "basin\n" +
                "basis\n" +
                "basket\n" +
                "basketball\n" +
                "bat\n" +
                "bath\n" +
                "bathe\n" +
                "bathroom\n" +
                "battery\n" +
                "battle\n" +
                "bay\n" +
                "be\n" +
                "be able to\n" +
                "be about to\n" +
                "be absorbed in\n" +
                "be abundant in\n" +
                "be accustomed to\n" +
                "be acquainted with\n" +
                "be adequate for\n" +
                "be alike to\n" +
                "be all ears\n" +
                "be at the end\n" +
                "be at war\n" +
                "be attached to\n" +
                "be attentive to\n" +
                "be available for\n" +
                "be aware of\n" +
                "be bound to\n" +
                "be bound up in\n" +
                "be bound up with\n" +
                "be burned to a crisp\n" +
                "be busy with\n" +
                "be capable of\n" +
                "be caught up in\n" +
                "be certain of\n" +
                "be certain to do sth\n" +
                "be concerned with\n" +
                "be detached from\n" +
                "be equal to\n" +
                "be fed up\n" +
                "be fond of\n" +
                "be friends with\n" +
                "be full of\n" +
                "be good at\n" +
                "be hard on sb.\n" +
                "be hard up\n" +
                "be ignorant of\n" +
                "be in drink\n" +
                "be in fashion\n" +
                "be in for\n" +
                "be in love with\n" +
                "be in sympathy with\n" +
                "be in the habit of\n" +
                "be in the wrong\n" +
                "be inferior to\n" +
                "be keen about\n" +
                "be keen on\n" +
                "be known as\n" +
                "be known for\n" +
                "be known to\n" +
                "be located in\n" +
                "be lost on\n" +
                "be loyal to\n" +
                "be on the advance\n" +
                "be on the drink\n" +
                "be out for\n" +
                "be out of employment\n" +
                "be out of style\n" +
                "be qualified to\n" +
                "be remarkable for\n" +
                "be representative of\n" +
                "be rid of\n" +
                "be satisfied with\n" +
                "be seated\n" +
                "be short of\n" +
                "be skilled in\n" +
                "be subject to\n" +
                "be supposed to\n" +
                "be sure and...\n" +
                "be sure of oneself\n" +
                "be thick with\n" +
                "be to blame\n" +
                "be typical of\n" +
                "be up against\n" +
                "be used to\n" +
                "be useful to\n" +
                "be very useful at\n" +
                "beach\n" +
                "beam\n" +
                "bean\n" +
                "bear\n" +
                "bear away\n" +
                "bear in mind\n" +
                "bear on\n" +
                "bear out\n" +
                "bear sth. in mind\n" +
                "bear with\n" +
                "beard\n" +
                "beast\n" +
                "beat\n" +
                "beat down\n" +
                "beat off\n" +
                "beat up and down\n" +
                "beautiful\n" +
                "beauty\n" +
                "because\n" +
                "become\n" +
                "bed\n" +
                "bee\n" +
                "beef\n" +
                "beer\n" +
                "before\n" +
                "before long\n" +
                "beg\n" +
                "beggar\n" +
                "begin\n" +
                "begin with\n" +
                "beginner\n" +
                "beginning\n" +
                "behalf\n" +
                "behave\n" +
                "behavior\n" +
                "behind\n" +
                "behind schedule\n" +
                "being\n" +
                "belief\n" +
                "believe\n" +
                "believe in\n" +
                "bell\n" +
                "belong\n" +
                "belong to\n" +
                "beloved\n" +
                "below\n" +
                "belt\n" +
                "bench\n" +
                "bend\n" +
                "bend one's knee to\n" +
                "beneath\n" +
                "beneficial\n" +
                "benefit\n" +
                "berry\n" +
                "beside\n" +
                "beside the point\n" +
                "beside the question\n" +
                "besides\n" +
                "best\n" +
                "best of all\n" +
                "bet\n" +
                "betray\n" +
                "better\n" +
                "between\n" +
                "beyond\n" +
                "beyond control\n" +
                "beyond number\n" +
                "beyond question\n" +
                "Bible\n" +
                "bicycle\n" +
                "big\n" +
                "bike\n" +
                "bill\n" +
                "billion\n" +
                "bind\n" +
                "biology\n" +
                "bird\n" +
                "birth\n" +
                "birthday\n" +
                "biscuit\n" +
                "bit\n" +
                "bit by bit\n" +
                "bite\n" +
                "bitter\n" +
                "bitterly\n" +
                "black\n" +
                "black and blue\n" +
                "black out\n" +
                "blackboard\n" +
                "blade\n" +
                "blame\n" +
                "blank\n" +
                "blanket\n" +
                "blast\n" +
                "blaze\n" +
                "bleed\n" +
                "blend\n" +
                "bless\n" +
                "blind\n" +
                "block\n" +
                "blood\n" +
                "bloom\n" +
                "blossom\n" +
                "blow\n" +
                "blow off\n" +
                "blow one's top\n" +
                "blow out\n" +
                "blow over\n" +
                "blow up\n" +
                "blue\n" +
                "board\n" +
                "boast\n" +
                "boast of\n" +
                "boat\n" +
                "body\n" +
                "boil\n" +
                "bold\n" +
                "bolt\n" +
                "bomb\n" +
                "bond\n" +
                "bone\n" +
                "book\n" +
                "boot\n" +
                "booth\n" +
                "border\n" +
                "border on\n" +
                "bore\n" +
                "born\n" +
                "born of\n" +
                "borrow\n" +
                "bosom\n" +
                "boss\n" +
                "both\n" +
                "both...and...\n" +
                "bother\n" +
                "bottle\n" +
                "bottom\n" +
                "bough\n" +
                "bounce\n" +
                "bound\n" +
                "boundary\n" +
                "bow\n" +
                "bowl\n" +
                "box\n" +
                "boy\n" +
                "brain\n" +
                "brake\n" +
                "branch\n" +
                "brand\n" +
                "brandy\n" +
                "brass\n" +
                "brave\n" +
                "bread\n" +
                "breadth\n" +
                "break\n" +
                "break away\n" +
                "break down\n" +
                "break faith\n" +
                "break in\n" +
                "break into\n" +
                "break into pieces\n" +
                "break off\n" +
                "break one's word\n" +
                "break out\n" +
                "break the ice\n" +
                "break through\n" +
                "break up\n" +
                "breakfast\n" +
                "breast\n" +
                "breath\n" +
                "breathe\n" +
                "breed\n" +
                "breeze\n" +
                "breeze through\n" +
                "brick\n" +
                "bridge\n" +
                "brief\n" +
                "bright\n" +
                "brighten\n" +
                "brilliant\n" +
                "brim\n" +
                "bring\n" +
                "bring back\n" +
                "bring down\n" +
                "bring forward\n" +
                "bring in\n" +
                "bring into action\n" +
                "bring into effect\n" +
                "bring into operation\n" +
                "bring out\n" +
                "bring through\n" +
                "bring to life\n" +
                "bring to ruin\n" +
                "bring together\n" +
                "bring up\n" +
                "bring up the rear\n" +
                "brisk\n" +
                "bristle\n" +
                "Britain\n" +
                "British\n" +
                "brittle\n" +
                "broad\n" +
                "broadcast\n" +
                "broken\n" +
                "bronze\n" +
                "brood\n" +
                "brook\n" +
                "broom\n" +
                "brother\n" +
                "brow\n" +
                "brown\n" +
                "bruise\n" +
                "brush\n" +
                "brush aside\n" +
                "brute\n" +
                "bubble\n" +
                "bucket\n" +
                "bud\n" +
                "build\n" +
                "build up\n" +
                "building\n" +
                "bulb\n" +
                "bulk\n" +
                "bull\n" +
                "bullet\n" +
                "bunch\n" +
                "bundle\n" +
                "burden\n" +
                "bureau\n" +
                "burn\n" +
                "burn out\n" +
                "burn up\n" +
                "burst\n" +
                "burst into laughter\n" +
                "burst out laughing\n" +
                "bury\n" +
                "bus\n" +
                "bush\n" +
                "business\n" +
                "busy\n" +
                "but\n" +
                "but for\n" +
                "butcher\n" +
                "butter\n" +
                "butterfly\n" +
                "button\n" +
                "button up\n" +
                "buy\n" +
                "buy off\n" +
                "buzz off\n" +
                "by\n" +
                "by accident\n" +
                "by air\n" +
                "by all means\n" +
                "by all nerves\n" +
                "by and by\n" +
                "by and large\n" +
                "by any means\n" +
                "by chance\n" +
                "by comparison\n" +
                "by error\n" +
                "by far\n" +
                "by force\n" +
                "by hand\n" +
                "by heart\n" +
                "by instinct\n" +
                "by itself\n" +
                "by little and little\n" +
                "by means of\n" +
                "by mistake\n" +
                "by name\n" +
                "by nature\n" +
                "by night\n" +
                "by no means\n" +
                "by oneself\n" +
                "by pressed for\n" +
                "by reason of\n" +
                "by reason that\n" +
                "by request\n" +
                "by the name of\n" +
                "by the way\n" +
                "by turns\n" +
                "by virtue of\n" +
                "by way of\n" +
                "by worthy of\n" +
                "by yourself\n" +
                "cabbage\n" +
                "cabin\n" +
                "cabinet\n" +
                "cable\n" +
                "cafe\n" +
                "cafeteria\n" +
                "cage\n" +
                "cake\n" +
                "calculate\n" +
                "calculation\n" +
                "calculator\n" +
                "calendar\n" +
                "call\n" +
                "call after\n" +
                "call back\n" +
                "call for\n" +
                "call forth\n" +
                "call in\n" +
                "call in question\n" +
                "call off\n" +
                "call on\n" +
                "call the roll\n" +
                "call up\n" +
                "calm\n" +
                "camel\n" +
                "camera\n" +
                "camp\n" +
                "campaign\n" +
                "campus\n" +
                "can\n" +
                "can not help\n" +
                "Canada\n" +
                "Canadian\n" +
                "canal\n" +
                "cancel\n" +
                "cancer\n" +
                "candidate\n" +
                "candle\n" +
                "candy\n" +
                "cannon\n" +
                "cannot but\n" +
                "cannot help\n" +
                "cannot help but\n" +
                "cannot...too...\n" +
                "canoe\n" +
                "canteen\n" +
                "canvas\n" +
                "cap\n" +
                "capable\n" +
                "capacity\n" +
                "capital\n" +
                "captain\n" +
                "captive\n" +
                "capture\n" +
                "car\n" +
                "carbon\n" +
                "card\n" +
                "care\n" +
                "care for\n" +
                "career\n" +
                "careful\n" +
                "careless\n" +
                "cargo\n" +
                "carpenter\n" +
                "carpet\n" +
                "carriage\n" +
                "carrier\n" +
                "carrot\n" +
                "carry\n" +
                "carry back\n" +
                "carry off\n" +
                "carry on\n" +
                "carry out\n" +
                "carry through\n" +
                "cart\n" +
                "carve\n" +
                "case\n" +
                "cash\n" +
                "cash in\n" +
                "cash in on\n" +
                "cassette\n" +
                "cast\n" +
                "cast about for\n" +
                "cast aside\n" +
                "cast back\n" +
                "cast oneself on\n" +
                "castle\n" +
                "casual\n" +
                "cat\n" +
                "catalog\n" +
                "catch\n" +
                "catch at\n" +
                "catch fire\n" +
                "catch on\n" +
                "catch one's breath\n" +
                "catch sb.'s eye\n" +
                "catch sight of\n" +
                "catch up with\n" +
                "cathedral\n" +
                "cattle\n" +
                "cause\n" +
                "cave\n" +
                "cave in\n" +
                "cease\n" +
                "ceiling\n" +
                "celebrate\n" +
                "cell\n" +
                "cellar\n" +
                "cement\n" +
                "cent\n" +
                "centigrade\n" +
                "centimetre\n" +
                "central\n" +
                "centre\n" +
                "century\n" +
                "ceremony\n" +
                "certain\n" +
                "certainly\n" +
                "certainty\n" +
                "certificate\n" +
                "chain\n" +
                "chair\n" +
                "chairman\n" +
                "chalk\n" +
                "challenge\n" +
                "chamber\n" +
                "champion\n" +
                "chance\n" +
                "change\n" +
                "channel\n" +
                "chapter\n" +
                "character\n" +
                "characteristic\n" +
                "charge\n" +
                "charity\n" +
                "charming\n" +
                "chart\n" +
                "chase\n" +
                "cheap\n" +
                "cheat\n" +
                "check\n" +
                "check in\n" +
                "check out\n" +
                "check up\n" +
                "cheek\n" +
                "cheer\n" +
                "cheer up\n" +
                "cheerful\n" +
                "cheese\n" +
                "chemical\n" +
                "chemist\n" +
                "chemistry\n" +
                "cheque\n" +
                "cherry\n" +
                "chess\n" +
                "chest\n" +
                "chew\n" +
                "chicken\n" +
                "chief\n" +
                "child\n" +
                "childhood\n" +
                "childish\n" +
                "chill\n" +
                "chimney\n" +
                "chin\n" +
                "china\n" +
                "Chinese\n" +
                "chocolate\n" +
                "choice\n" +
                "choke\n" +
                "choose\n" +
                "chop\n" +
                "Christian\n" +
                "Christmas\n" +
                "church\n" +
                "cigaret\n" +
                "cinema\n" +
                "circle\n" +
                "circuit\n" +
                "circular\n" +
                "circulate\n" +
                "circumference\n" +
                "circumstance\n" +
                "citizen\n" +
                "city\n" +
                "civil\n" +
                "civilization\n" +
                "civilize\n" +
                "claim\n" +
                "clap\n" +
                "clap eyes on\n" +
                "clarify\n" +
                "clasp\n" +
                "class\n" +
                "classical\n" +
                "classification\n" +
                "classify\n" +
                "classmate\n" +
                "classroom\n" +
                "claw\n" +
                "clay\n" +
                "clean\n" +
                "clear\n" +
                "clear away\n" +
                "clear off\n" +
                "clear out\n" +
                "clear up\n" +
                "clearly\n" +
                "clerk\n" +
                "clever\n" +
                "cliff\n" +
                "climate\n" +
                "climb\n" +
                "cloak\n" +
                "clock\n" +
                "close\n" +
                "close about\n" +
                "close down\n" +
                "close in\n" +
                "close up\n" +
                "closely\n" +
                "cloth\n" +
                "clothe\n" +
                "clothes\n" +
                "clothing\n" +
                "cloud\n" +
                "cloudy\n" +
                "club\n" +
                "clue\n" +
                "clumsy\n" +
                "coach\n" +
                "coal\n" +
                "coarse\n" +
                "coast\n" +
                "coat\n" +
                "cock\n" +
                "code\n" +
                "coffee\n" +
                "coil\n" +
                "coin\n" +
                "cold\n" +
                "collapse\n" +
                "collar\n" +
                "colleague\n" +
                "collect\n" +
                "collection\n" +
                "collective\n" +
                "college\n" +
                "collision\n" +
                "colonel\n" +
                "colony\n" +
                "color\n" +
                "column\n" +
                "comb\n" +
                "combination\n" +
                "combine\n" +
                "come\n" +
                "come about\n" +
                "come across\n" +
                "come at\n" +
                "come before\n" +
                "come by\n" +
                "come down\n" +
                "come down on\n" +
                "come for\n" +
                "come forth\n" +
                "come home\n" +
                "come into\n" +
                "come into effect\n" +
                "come into operation\n" +
                "come into use\n" +
                "come of\n" +
                "come off\n" +
                "come on\n" +
                "come out\n" +
                "come round\n" +
                "come through\n" +
                "come to\n" +
                "come to a close\n" +
                "come to an end\n" +
                "come to life\n" +
                "come to one's senses\n" +
                "come to terms with\n" +
                "come to the point\n" +
                "come true\n" +
                "come up\n" +
                "come up against\n" +
                "come up to\n" +
                "come up with\n" +
                "come what may\n" +
                "comfort\n" +
                "comfortable\n" +
                "command\n" +
                "commander\n" +
                "comment\n" +
                "commerce\n" +
                "commercial\n" +
                "commission\n" +
                "commit\n" +
                "committee\n" +
                "common\n" +
                "commonly\n" +
                "communicate\n" +
                "communication\n" +
                "communism\n" +
                "communist\n" +
                "community\n" +
                "companion\n" +
                "company\n" +
                "comparative\n" +
                "compare\n" +
                "compare...to\n" +
                "comparison\n" +
                "compass\n" +
                "compel\n" +
                "compete\n" +
                "competent\n" +
                "competition\n" +
                "compile\n" +
                "complain\n" +
                "complaint\n" +
                "complete\n" +
                "completely\n" +
                "complex\n" +
                "complicate\n" +
                "complicated\n" +
                "component\n" +
                "compose\n" +
                "composition\n" +
                "compound\n" +
                "comprehension\n" +
                "comprehensive\n" +
                "compress\n" +
                "comprise\n" +
                "compromise\n" +
                "compute\n" +
                "computer\n" +
                "comrade\n" +
                "conceal\n" +
                "concentrate\n" +
                "concentration\n" +
                "concept\n" +
                "concern\n" +
                "concerning\n" +
                "concert\n" +
                "conclude\n" +
                "conclusion\n" +
                "concrete\n" +
                "condemn\n" +
                "condense\n" +
                "condition\n" +
                "conduct\n" +
                "conductor\n" +
                "conference\n" +
                "confess\n" +
                "confidence\n" +
                "confident\n" +
                "confine\n" +
                "confirm\n" +
                "conflict\n" +
                "confuse\n" +
                "confusion\n" +
                "congratulate\n" +
                "congratulation\n" +
                "congress\n" +
                "conjunction\n" +
                "connect\n" +
                "connection\n" +
                "conquer\n" +
                "conquest\n" +
                "conscience\n" +
                "conscious\n" +
                "consciousness\n" +
                "consent\n" +
                "consequence\n" +
                "consequently\n" +
                "conservation\n" +
                "conservative\n" +
                "consider\n" +
                "considerable\n" +
                "considerate\n" +
                "consideration\n" +
                "consist\n" +
                "consist in\n" +
                "consist of\n" +
                "consistent\n" +
                "constant\n" +
                "constitution\n" +
                "construct\n" +
                "construction\n" +
                "consult\n" +
                "consult with\n" +
                "consume\n" +
                "consumption\n" +
                "contact\n" +
                "contain\n" +
                "container\n" +
                "contemporary\n" +
                "contempt\n" +
                "content\n" +
                "contest\n" +
                "continent\n" +
                "continual\n" +
                "continue\n" +
                "continuous\n" +
                "contract\n" +
                "contradiction\n" +
                "contrary\n" +
                "contrast\n" +
                "contribute\n" +
                "contribute to\n" +
                "control\n" +
                "convenience\n" +
                "convenient\n" +
                "convention\n" +
                "conventional\n" +
                "conversation\n" +
                "conversely\n" +
                "conversion\n" +
                "convert\n" +
                "convey\n" +
                "convince\n" +
                "cook\n" +
                "cool\n" +
                "cooperate\n" +
                "coordinate\n" +
                "cope\n" +
                "cope with\n" +
                "copper\n" +
                "copy\n" +
                "cord\n" +
                "cordial\n" +
                "core\n" +
                "corn\n" +
                "corner\n" +
                "corporation\n" +
                "correct\n" +
                "correction\n" +
                "correspond\n" +
                "correspondent\n" +
                "corresponding\n" +
                "corridor\n" +
                "cost\n" +
                "costly\n" +
                "cottage\n" +
                "cotton\n" +
                "cough\n" +
                "could\n" +
                "council\n" +
                "count\n" +
                "count on\n" +
                "count out\n" +
                "count up\n" +
                "counter\n" +
                "country\n" +
                "countryside\n" +
                "county\n" +
                "couple\n" +
                "courage\n" +
                "course\n" +
                "court\n" +
                "cousin\n" +
                "cover\n" +
                "cover up\n" +
                "cow\n" +
                "coward\n" +
                "crack\n" +
                "craft\n" +
                "crane\n" +
                "crash\n" +
                "crawl\n" +
                "crazy\n" +
                "cream\n" +
                "create\n" +
                "creative\n" +
                "creature\n" +
                "credit\n" +
                "credit with\n" +
                "creep\n" +
                "crew\n" +
                "cricket\n" +
                "crime\n" +
                "criminal\n" +
                "cripple\n" +
                "crisis\n" +
                "critic\n" +
                "critical\n" +
                "criticism\n" +
                "criticize\n" +
                "crop\n" +
                "cross\n" +
                "cross off\n" +
                "cross out\n" +
                "crow\n" +
                "crowd\n" +
                "crown\n" +
                "crude\n" +
                "cruel\n" +
                "crush\n" +
                "crust\n" +
                "cry\n" +
                "cry down\n" +
                "cry for\n" +
                "cry off\n" +
                "cry out\n" +
                "crystal\n" +
                "cube\n" +
                "cubic\n" +
                "cucumber\n" +
                "cultivate\n" +
                "culture\n" +
                "cunning\n" +
                "cup\n" +
                "cupboard\n" +
                "cure\n" +
                "curiosity\n" +
                "curious\n" +
                "curl\n" +
                "current\n" +
                "curse\n" +
                "curtain\n" +
                "curve\n" +
                "cushion\n" +
                "custom\n" +
                "customer\n" +
                "cut\n" +
                "cut across\n" +
                "cut back\n" +
                "cut down\n" +
                "cut in\n" +
                "cut into\n" +
                "cut off\n" +
                "cut out\n" +
                "cut short\n" +
                "cut through\n" +
                "cut up\n" +
                "cycle\n" +
                "daily\n" +
                "dairy\n" +
                "dam\n" +
                "damage\n" +
                "damp\n" +
                "dance\n" +
                "danger\n" +
                "dangerous\n" +
                "dare\n" +
                "daring\n" +
                "dark\n" +
                "darling\n" +
                "dash\n" +
                "data\n" +
                "date\n" +
                "date back to\n" +
                "daughter\n" +
                "dawn\n" +
                "day\n" +
                "day after day\n" +
                "day in day out\n" +
                "daylight\n" +
                "dead\n" +
                "deadly\n" +
                "deaf\n" +
                "deal\n" +
                "deal in\n" +
                "deal out\n" +
                "deal with\n" +
                "dear\n" +
                "death\n" +
                "debate\n" +
                "debt\n" +
                "decade\n" +
                "decay\n" +
                "deceit\n" +
                "deceive\n" +
                "December\n" +
                "decent\n" +
                "decide\n" +
                "decide for\n" +
                "decide on\n" +
                "decision\n" +
                "deck\n" +
                "declare\n" +
                "decorate\n" +
                "decrease\n" +
                "dedicate to\n" +
                "deduce\n" +
                "deed\n" +
                "deep\n" +
                "deepen\n" +
                "deer\n" +
                "defeat\n" +
                "defect\n" +
                "defence\n" +
                "defend\n" +
                "define\n" +
                "definite\n" +
                "definitely\n" +
                "definition\n" +
                "degree\n" +
                "delay\n" +
                "delegation\n" +
                "delete\n" +
                "delicate\n" +
                "delicious\n" +
                "delight\n" +
                "deliver\n" +
                "delivery\n" +
                "demand\n" +
                "democracy\n" +
                "democratic\n" +
                "demonstrate\n" +
                "dense\n" +
                "density\n" +
                "deny\n" +
                "depart\n" +
                "depart from\n" +
                "department\n" +
                "departure\n" +
                "depend\n" +
                "dependent\n" +
                "deposit\n" +
                "depress\n" +
                "depth\n" +
                "derive\n" +
                "derive from\n" +
                "descend\n" +
                "describe\n" +
                "description\n" +
                "desert\n" +
                "deserve\n" +
                "design\n" +
                "desirable\n" +
                "desire\n" +
                "desk\n" +
                "despair\n" +
                "desperate\n" +
                "despise\n" +
                "despite\n" +
                "destination\n" +
                "destroy\n" +
                "destruction\n" +
                "detail\n" +
                "detect\n" +
                "detection\n" +
                "determination\n" +
                "determine\n" +
                "develop\n" +
                "development\n" +
                "device\n" +
                "devil\n" +
                "devise\n" +
                "devote\n" +
                "devote oneself to\n" +
                "dew\n" +
                "diagram\n" +
                "dial\n" +
                "dialect\n" +
                "dialog\n" +
                "diameter\n" +
                "diamond\n" +
                "diary\n" +
                "dictate\n" +
                "dictation\n" +
                "dictionary\n" +
                "die\n" +
                "die away\n" +
                "die for\n" +
                "die from\n" +
                "die of illness\n" +
                "die off\n" +
                "die out\n" +
                "differ\n" +
                "difference\n" +
                "different\n" +
                "difficult\n" +
                "difficulty\n" +
                "dig\n" +
                "dig down\n" +
                "dig in\n" +
                "dig out\n" +
                "dig up\n" +
                "digest\n" +
                "digital\n" +
                "diligent\n" +
                "dim\n" +
                "dimension\n" +
                "dinner\n" +
                "dip\n" +
                "dip into\n" +
                "direct\n" +
                "direction\n" +
                "directly\n" +
                "director\n" +
                "dirt\n" +
                "dirty\n" +
                "disable\n" +
                "disadvantage\n" +
                "disagree\n" +
                "disappear\n" +
                "disappoint\n" +
                "disaster\n" +
                "discard\n" +
                "discharge\n" +
                "discipline\n" +
                "disclose\n" +
                "discourage\n" +
                "discover\n" +
                "discovery\n" +
                "discuss\n" +
                "discussion\n" +
                "disease\n" +
                "disguise\n" +
                "disgust\n" +
                "dish\n" +
                "dishonour\n" +
                "disk\n" +
                "dislike\n" +
                "dismiss\n" +
                "disorder\n" +
                "display\n" +
                "displease\n" +
                "disposal\n" +
                "dispose\n" +
                "dispute\n" +
                "dissatisfy\n" +
                "dissolve\n" +
                "distance\n" +
                "distant\n" +
                "distinct\n" +
                "distinction\n" +
                "distinguish\n" +
                "distress\n" +
                "distribute\n" +
                "distribution\n" +
                "district\n" +
                "disturb\n" +
                "ditch\n" +
                "dive\n" +
                "diverse\n" +
                "divide\n" +
                "division\n" +
                "divorce\n" +
                "do\n" +
                "do a good job\n" +
                "do away with\n" +
                "do by sb.\n" +
                "do down\n" +
                "do duty for\n" +
                "do for\n" +
                "do justice\n" +
                "do one's best\n" +
                "do one's bit\n" +
                "do one's duty\n" +
                "do one's hair\n" +
                "do one's level best\n" +
                "do one's utmost\n" +
                "do sb. a favour\n" +
                "do sb. good\n" +
                "do sb. wrong\n" +
                "do up\n" +
                "do up one's hair\n" +
                "do with\n" +
                "do without\n" +
                "do wrong\n" +
                "dock\n" +
                "doctor\n" +
                "document\n" +
                "dog\n" +
                "dollar\n" +
                "domestic\n" +
                "donkey\n" +
                "door\n" +
                "dorm\n" +
                "dormitory\n" +
                "dose\n" +
                "dot\n" +
                "double\n" +
                "double back\n" +
                "double up\n" +
                "doubt\n" +
                "doubtful\n" +
                "doubtless\n" +
                "down\n" +
                "down with\n" +
                "downstairs\n" +
                "downward\n" +
                "dozen\n" +
                "draft\n" +
                "drag\n" +
                "drag in\n" +
                "drag on\n" +
                "dragon\n" +
                "drain\n" +
                "drain off\n" +
                "drain...of\n" +
                "drama\n" +
                "dramatic\n" +
                "draw\n" +
                "draw a conclusion\n" +
                "draw aside\n" +
                "draw away\n" +
                "draw back\n" +
                "draw in\n" +
                "draw into\n" +
                "draw lots\n" +
                "draw on\n" +
                "draw out\n" +
                "draw to a close\n" +
                "draw up\n" +
                "drawer\n" +
                "drawing\n" +
                "dread\n" +
                "dream\n" +
                "dream of\n" +
                "dream up\n" +
                "dress\n" +
                "dress up\n" +
                "drift\n" +
                "drill\n" +
                "drink\n" +
                "drink down\n" +
                "drink to\n" +
                "drink up\n" +
                "drip\n" +
                "drive\n" +
                "drive at\n" +
                "drive away at\n" +
                "drive home\n" +
                "drive out\n" +
                "drive up\n" +
                "driver\n" +
                "drop\n" +
                "drop by\n" +
                "drop off\n" +
                "drop on\n" +
                "drop out\n" +
                "drop over\n" +
                "drop to one's knees\n" +
                "drought\n" +
                "drown\n" +
                "drug\n" +
                "drum\n" +
                "drunk\n" +
                "dry\n" +
                "dry up\n" +
                "duck\n" +
                "due\n" +
                "due to\n" +
                "dull\n" +
                "dumb\n" +
                "dump\n" +
                "durable\n" +
                "duration\n" +
                "during\n" +
                "dusk\n" +
                "dust\n" +
                "duty\n" +
                "dwell on\n" +
                "dwelling\n" +
                "dye\n" +
                "dying\n" +
                "dynamic\n" +
                "each\n" +
                "each other\n" +
                "eager\n" +
                "eagle\n" +
                "ear\n" +
                "early\n" +
                "early and late\n" +
                "early or late\n" +
                "earn\n" +
                "earn one's living\n" +
                "earnest\n" +
                "earth\n" +
                "earthquake\n" +
                "ease\n" +
                "easily\n" +
                "east\n" +
                "eastern\n" +
                "easy\n" +
                "eat\n" +
                "eat of\n" +
                "eat off\n" +
                "eat up\n" +
                "echo\n" +
                "economic\n" +
                "economical\n" +
                "economy\n" +
                "edge\n" +
                "edition\n" +
                "editor\n" +
                "educate\n" +
                "education\n" +
                "effect\n" +
                "effective\n" +
                "efficiency\n" +
                "efficient\n" +
                "effort\n" +
                "egg\n" +
                "eight\n" +
                "eighteen\n" +
                "eighth\n" +
                "eighty\n" +
                "either\n" +
                "either...or\n" +
                "elaborate\n" +
                "elastic\n" +
                "elbow\n" +
                "elder\n" +
                "elect\n" +
                "election\n" +
                "electric\n" +
                "electrical\n" +
                "electricity\n" +
                "electron\n" +
                "electronic\n" +
                "electronics\n" +
                "element\n" +
                "elementary\n" +
                "elephant\n" +
                "elevator\n" +
                "eleven\n" +
                "eleventh\n" +
                "eliminate\n" +
                "elimination\n" +
                "else\n" +
                "elsewhere\n" +
                "embarrass\n" +
                "embrace\n" +
                "emerge\n" +
                "emergency\n" +
                "emit\n" +
                "emotion\n" +
                "emotional\n" +
                "emperor\n" +
                "emphasis\n" +
                "emphasize\n" +
                "empire\n" +
                "employ\n" +
                "employ oneself in\n" +
                "employee\n" +
                "employer\n" +
                "employment\n" +
                "empty\n" +
                "empty of\n" +
                "enable\n" +
                "enclose\n" +
                "encounter\n" +
                "encourage\n" +
                "end\n" +
                "end in\n" +
                "end off\n" +
                "end up\n" +
                "end up with\n" +
                "ending\n" +
                "endless\n" +
                "endure\n" +
                "enemy\n" +
                "energy\n" +
                "enforce\n" +
                "engage\n" +
                "engaged in\n" +
                "engaged with\n" +
                "engine\n" +
                "engineer\n" +
                "engineering\n" +
                "England\n" +
                "English\n" +
                "Englishman\n" +
                "enjoy\n" +
                "enjoy oneself\n" +
                "enlarge\n" +
                "enormous\n" +
                "enough\n" +
                "ensure\n" +
                "ensure sb. against\n" +
                "enter\n" +
                "enter into\n" +
                "enter upon\n" +
                "entertain\n" +
                "enthusiasm\n" +
                "enthusiastic\n" +
                "entire\n" +
                "entitle\n" +
                "entrance\n" +
                "entry\n" +
                "envelope\n" +
                "environment\n" +
                "envy\n" +
                "equal\n" +
                "equality\n" +
                "equation\n" +
                "equip\n" +
                "equip with\n" +
                "equipment\n" +
                "equivalent\n" +
                "era\n" +
                "erect\n" +
                "error\n" +
                "escape\n" +
                "especially\n" +
                "essay\n" +
                "essential\n" +
                "establish\n" +
                "establishment\n" +
                "estimate\n" +
                "Europe\n" +
                "European\n" +
                "evaluate\n" +
                "evaporate\n" +
                "eve\n" +
                "even\n" +
                "even if\n" +
                "even now\n" +
                "evening\n" +
                "event\n" +
                "eventually\n" +
                "ever\n" +
                "ever since\n" +
                "ever so\n" +
                "every\n" +
                "every bit\n" +
                "every other\n" +
                "every other day\n" +
                "everybody\n" +
                "everyday\n" +
                "everyone\n" +
                "everything\n" +
                "everywhere\n" +
                "evidence\n" +
                "evident\n" +
                "evil\n" +
                "evolution\n" +
                "evolve\n" +
                "exact\n" +
                "exactly\n" +
                "exaggerate\n" +
                "exam\n" +
                "examination\n" +
                "examine\n" +
                "example\n" +
                "exceed\n" +
                "exceedingly\n" +
                "excellent\n" +
                "except\n" +
                "except for\n" +
                "exception\n" +
                "excess\n" +
                "excessive\n" +
                "exchange\n" +
                "excite\n" +
                "exciting\n" +
                "exclaim\n" +
                "exclude\n" +
                "exclusively\n" +
                "excursion\n" +
                "excuse\n" +
                "execute\n" +
                "executive\n" +
                "exercise\n" +
                "exert\n" +
                "exert oneself to\n" +
                "exhaust\n" +
                "exhibit\n" +
                "exhibition\n" +
                "exist\n" +
                "existence\n" +
                "exit\n" +
                "expand\n" +
                "expansion\n" +
                "expect\n" +
                "expect of\n" +
                "expectation\n" +
                "expense\n" +
                "expensive\n" +
                "experience\n" +
                "experiment\n" +
                "experimental\n" +
                "expert\n" +
                "explain\n" +
                "explanation\n" +
                "explode\n" +
                "exploit\n" +
                "explore\n" +
                "explosion\n" +
                "explosive\n" +
                "export\n" +
                "expose\n" +
                "exposure\n" +
                "express\n" +
                "expression\n" +
                "extend\n" +
                "extension\n" +
                "extensive\n" +
                "extent\n" +
                "exterior\n" +
                "external\n" +
                "extra\n" +
                "extraordinary\n" +
                "extreme\n" +
                "extremely\n" +
                "eye\n" +
                "eyesight\n" +
                "fable\n" +
                "fabric\n" +
                "face\n" +
                "face to face\n" +
                "face up to\n" +
                "facility\n" +
                "fact\n" +
                "factor\n" +
                "factory\n" +
                "faculty\n" +
                "fade\n" +
                "Fahrenheit\n" +
                "fail\n" +
                "fail in\n" +
                "fail to\n" +
                "failure\n" +
                "faint\n" +
                "fair\n" +
                "fairly\n" +
                "faith\n" +
                "faithful\n" +
                "fall\n" +
                "fall back on\n" +
                "fall behind\n" +
                "fall for\n" +
                "fall in love\n" +
                "fall in love with\n" +
                "fall in with\n" +
                "fall into\n" +
                "fall on one's knees\n" +
                "fall out\n" +
                "fall out of\n" +
                "fall through\n" +
                "fall to\n" +
                "fall under\n" +
                "fame\n" +
                "familiar\n" +
                "family\n" +
                "famine\n" +
                "famous\n" +
                "fan\n" +
                "fancy\n" +
                "far\n" +
                "far and away\n" +
                "far and near\n" +
                "far from\n" +
                "fare\n" +
                "farewell\n" +
                "farm\n" +
                "farmer\n" +
                "farther\n" +
                "fashion\n" +
                "fashionable\n" +
                "fast\n" +
                "fasten\n" +
                "fatal\n" +
                "fate\n" +
                "father\n" +
                "father-in-law\n" +
                "fatigue\n" +
                "fault\n" +
                "faulty\n" +
                "favour\n" +
                "favourable\n" +
                "favourite\n" +
                "fear\n" +
                "fear for\n" +
                "fearful\n" +
                "feasible\n" +
                "feast\n" +
                "feather\n" +
                "feature\n" +
                "February\n" +
                "federal\n" +
                "fee\n" +
                "feeble\n" +
                "feed\n" +
                "feed on\n" +
                "feed up\n" +
                "feed with\n" +
                "feedback\n" +
                "feel\n" +
                "feel amused at\n" +
                "feel like\n" +
                "feel out\n" +
                "feel up to\n" +
                "feeling\n" +
                "fellow\n" +
                "female\n" +
                "fence\n" +
                "fertile\n" +
                "fertilizer\n" +
                "festival\n" +
                "fetch\n" +
                "fever\n" +
                "few\n" +
                "fibre\n" +
                "fiction\n" +
                "field\n" +
                "fierce\n" +
                "fifteen\n" +
                "fifth\n" +
                "fifty\n" +
                "fight\n" +
                "figure\n" +
                "figure on\n" +
                "figure out\n" +
                "figure up\n" +
                "file\n" +
                "fill\n" +
                "fill in\n" +
                "fill out\n" +
                "fill up\n" +
                "film\n" +
                "filter\n" +
                "final\n" +
                "finally\n" +
                "finance\n" +
                "financial\n" +
                "find\n" +
                "find expression in\n" +
                "find oneself\n" +
                "find out\n" +
                "finding\n" +
                "fine\n" +
                "finger\n" +
                "finish\n" +
                "finish up\n" +
                "finish up with\n" +
                "finish with\n" +
                "fire\n" +
                "fire up\n" +
                "fireman\n" +
                "firm\n" +
                "first\n" +
                "first and foremost\n" +
                "first of all\n" +
                "first or last\n" +
                "fish\n" +
                "fish out\n" +
                "fisherman\n" +
                "fist\n" +
                "fit\n" +
                "five\n" +
                "fix\n" +
                "fix one's eyes on\n" +
                "fix up\n" +
                "flag\n" +
                "flame\n" +
                "flame out\n" +
                "flare\n" +
                "flare up\n" +
                "flash\n" +
                "flash out\n" +
                "flat\n" +
                "flavour\n" +
                "fleet\n" +
                "flesh\n" +
                "flexible\n" +
                "flight\n" +
                "float\n" +
                "flock\n" +
                "flood\n" +
                "floor\n" +
                "flour\n" +
                "flourish\n" +
                "flow\n" +
                "flower\n" +
                "flu\n" +
                "fluent\n" +
                "fluid\n" +
                "flush\n" +
                "fly\n" +
                "fly into a temper\n" +
                "focus\n" +
                "focus...on\n" +
                "fog\n" +
                "fold\n" +
                "folk\n" +
                "follow\n" +
                "follow out\n" +
                "follow through\n" +
                "follow up\n" +
                "following\n" +
                "fond\n" +
                "food\n" +
                "fool\n" +
                "foolish\n" +
                "foot\n" +
                "football\n" +
                "footstep\n" +
                "for\n" +
                "for ages\n" +
                "for certain\n" +
                "for ever\n" +
                "for example\n" +
                "for fear of\n" +
                "for good\n" +
                "for instance\n" +
                "for lack of\n" +
                "for life\n" +
                "for sale\n" +
                "for sure\n" +
                "for the best\n" +
                "for the better\n" +
                "for the future\n" +
                "for the moment\n" +
                "for the present\n" +
                "for the rest\n" +
                "for the sake of\n" +
                "for the time being\n" +
                "for what it is worth\n" +
                "forbid\n" +
                "force\n" +
                "forecast\n" +
                "forehead\n" +
                "foreign\n" +
                "foreigner\n" +
                "foremost\n" +
                "forest\n" +
                "forever\n" +
                "forget\n" +
                "forget about\n" +
                "forgive\n" +
                "fork\n" +
                "form\n" +
                "formal\n" +
                "formation\n" +
                "former\n" +
                "formula\n" +
                "forth\n" +
                "fortnight\n" +
                "fortunate\n" +
                "fortunately\n" +
                "fortune\n" +
                "forty\n" +
                "forward\n" +
                "found\n" +
                "foundation\n" +
                "fountain\n" +
                "four\n" +
                "fourteen\n" +
                "fourth\n" +
                "fox\n" +
                "fraction\n" +
                "fragment\n" +
                "frame\n" +
                "framework\n" +
                "France\n" +
                "frank\n" +
                "free\n" +
                "free and easy\n" +
                "free from\n" +
                "free of\n" +
                "freedom\n" +
                "freely\n" +
                "freeze\n" +
                "freeze up\n" +
                "freight\n" +
                "French\n" +
                "frequency\n" +
                "frequent\n" +
                "frequently\n" +
                "fresh\n" +
                "friction\n" +
                "Friday\n" +
                "fridge\n" +
                "friend\n" +
                "friendly\n" +
                "friendship\n" +
                "frighten\n" +
                "frog\n" +
                "from\n" +
                "from memory\n" +
                "from now on\n" +
                "from time to time\n" +
                "front\n" +
                "frontier\n" +
                "frost\n" +
                "frown\n" +
                "fruit\n" +
                "fruitful\n" +
                "fry\n" +
                "fuel\n" +
                "fulfil\n" +
                "full\n" +
                "fun\n" +
                "function\n" +
                "fund\n" +
                "fundamental\n" +
                "funeral\n" +
                "funny\n" +
                "fur\n" +
                "furious\n" +
                "furnace\n" +
                "furnish\n" +
                "furniture\n" +
                "further\n" +
                "furthermore\n" +
                "future\n" +
                "gain\n" +
                "gain on\n" +
                "gallery\n" +
                "gallon\n" +
                "game\n" +
                "gang\n" +
                "gap\n" +
                "garage\n" +
                "garbage\n" +
                "garden\n" +
                "gardener\n" +
                "gas\n" +
                "gaseous\n" +
                "gasoline\n" +
                "gasp\n" +
                "gate\n" +
                "gather\n" +
                "gauge\n" +
                "gay\n" +
                "gaze\n" +
                "general\n" +
                "generally\n" +
                "generate\n" +
                "generation\n" +
                "generation gap\n" +
                "generator\n" +
                "generous\n" +
                "genius\n" +
                "gentle\n" +
                "gentleman\n" +
                "gently\n" +
                "genuine\n" +
                "geography\n" +
                "geometry\n" +
                "germ\n" +
                "German\n" +
                "Germany\n" +
                "gesture\n" +
                "get\n" +
                "get about\n" +
                "get above oneself\n" +
                "get across\n" +
                "get ahead\n" +
                "get along\n" +
                "get along with\n" +
                "get around\n" +
                "get at\n" +
                "get away\n" +
                "get back at\n" +
                "get by\n" +
                "get down\n" +
                "get down to\n" +
                "get down to work\n" +
                "get hold of\n" +
                "get in\n" +
                "get into\n" +
                "get into debt\n" +
                "get into the act\n" +
                "get off\n" +
                "get on\n" +
                "get on to\n" +
                "get on with\n" +
                "get one's hands on\n" +
                "get out\n" +
                "get out of\n" +
                "get over\n" +
                "get ready\n" +
                "get rid of\n" +
                "get the best of\n" +
                "get the better of\n" +
                "get through\n" +
                "get together\n" +
                "get up\n" +
                "ghost\n" +
                "giant\n" +
                "gift\n" +
                "girl\n" +
                "give\n" +
                "give away\n" +
                "give back\n" +
                "give birth\n" +
                "give ear to\n" +
                "give expression to\n" +
                "give in\n" +
                "give notice\n" +
                "give occasion to\n" +
                "give off\n" +
                "give one's ears\n" +
                "give out\n" +
                "give rise to\n" +
                "give satisfaction\n" +
                "give up\n" +
                "give way\n" +
                "give way to\n" +
                "glad\n" +
                "glance\n" +
                "glare\n" +
                "glass\n" +
                "glide\n" +
                "glimpse\n" +
                "glitter\n" +
                "globe\n" +
                "gloomy\n" +
                "glorious\n" +
                "glory\n" +
                "glove\n" +
                "glow\n" +
                "glue\n" +
                "go\n" +
                "go about\n" +
                "go after\n" +
                "go ahead\n" +
                "go all out\n" +
                "go along with\n" +
                "go around\n" +
                "go back on\n" +
                "go back to\n" +
                "go beyond the limit\n" +
                "go by\n" +
                "go down\n" +
                "go for\n" +
                "go hard with sb.\n" +
                "go in for\n" +
                "go into\n" +
                "go into action\n" +
                "go off\n" +
                "go off with\n" +
                "go on\n" +
                "go on the stage\n" +
                "go out\n" +
                "go out of one's way\n" +
                "go over\n" +
                "go through\n" +
                "go to excess\n" +
                "go to great lengths\n" +
                "go to pieces\n" +
                "go to sleep\n" +
                "go to the expense of\n" +
                "go together\n" +
                "go up\n" +
                "go with\n" +
                "go without\n" +
                "go wrong\n" +
                "goal\n" +
                "goat\n" +
                "God\n" +
                "gold\n" +
                "golden\n" +
                "golf\n" +
                "good\n" +
                "good for\n" +
                "good-bye\n" +
                "goodness\n" +
                "goods\n" +
                "goose\n" +
                "govern\n" +
                "government\n" +
                "governor\n" +
                "gown\n" +
                "grace\n" +
                "graceful\n" +
                "gracious\n" +
                "grade\n" +
                "gradual\n" +
                "gradually\n" +
                "graduate\n" +
                "grain\n" +
                "grammar\n" +
                "grammatical\n" +
                "gramme\n" +
                "grand\n" +
                "granddaughter\n" +
                "grandfather\n" +
                "grandmother\n" +
                "grandson\n" +
                "grant\n" +
                "grape\n" +
                "graph\n" +
                "grasp\n" +
                "grasp at\n" +
                "grass\n" +
                "grateful\n" +
                "gratitude\n" +
                "grave\n" +
                "gravity\n" +
                "gray\n" +
                "great\n" +
                "greatly\n" +
                "greedy\n" +
                "Greek\n" +
                "green\n" +
                "greenhouse\n" +
                "greet\n" +
                "greeting\n" +
                "grey\n" +
                "grieve\n" +
                "grind\n" +
                "grip\n" +
                "groan\n" +
                "grocer\n" +
                "grocery\n" +
                "gross\n" +
                "ground\n" +
                "group\n" +
                "grow\n" +
                "grow on\n" +
                "grow up\n" +
                "growth\n" +
                "guarantee\n" +
                "guarantee against\n" +
                "guard\n" +
                "guess\n" +
                "guest\n" +
                "guidance\n" +
                "guide\n" +
                "guilty\n" +
                "gulf\n" +
                "gum\n" +
                "gun\n" +
                "gunpowder\n" +
                "gymnasium\n" +
                "habit\n" +
                "habitual\n" +
                "had best\n" +
                "had better do sth.\n" +
                "had rather...\n" +
                "hair\n" +
                "haircut\n" +
                "half\n" +
                "hall\n" +
                "halt\n" +
                "hamburger\n" +
                "hammer\n" +
                "hand\n" +
                "hand down\n" +
                "hand in\n" +
                "hand in hand\n" +
                "hand on\n" +
                "hand out\n" +
                "hand over\n" +
                "handful\n" +
                "handkerchief\n" +
                "handle\n" +
                "handsome\n" +
                "handwriting\n" +
                "handy\n" +
                "hang\n" +
                "hang about\n" +
                "hang on\n" +
                "hang on to\n" +
                "hang up\n" +
                "happen\n" +
                "happen on\n" +
                "happen to\n" +
                "happiness\n" +
                "happy\n" +
                "harbour\n" +
                "hard\n" +
                "harden\n" +
                "hardly\n" +
                "hardly any\n" +
                "hardly...when...\n" +
                "hardship\n" +
                "hardware\n" +
                "hare\n" +
                "harm\n" +
                "harmful\n" +
                "harmony\n" +
                "harness\n" +
                "harsh\n" +
                "harvest\n" +
                "haste\n" +
                "hasten\n" +
                "hasty\n" +
                "hat\n" +
                "hatch\n" +
                "hate\n" +
                "hateful\n" +
                "hatred\n" +
                "have\n" +
                "have a ball\n" +
                "have a dislike of\n" +
                "have a good time\n" +
                "have back\n" +
                "have mercy on\n" +
                "have no business\n" +
                "have no lack of\n" +
                "have notice of\n" +
                "have on\n" +
                "have one's day\n" +
                "have respect for\n" +
                "have sth. to do with\n" +
                "have to\n" +
                "have to do with\n" +
                "hawk\n" +
                "hay\n" +
                "hazard\n" +
                "he\n" +
                "head\n" +
                "head for\n" +
                "head on\n" +
                "head up\n" +
                "headache\n" +
                "heading\n" +
                "headline\n" +
                "headmaster\n" +
                "headquarters\n" +
                "heal\n" +
                "health\n" +
                "healthy\n" +
                "heap\n" +
                "hear\n" +
                "hear from\n" +
                "hear of\n" +
                "heart\n" +
                "heart and soul\n" +
                "heart to heart\n" +
                "heat\n" +
                "heating\n" +
                "heaven\n" +
                "heavily\n" +
                "heavy\n" +
                "hedge\n" +
                "heel\n" +
                "height\n" +
                "heir\n" +
                "helicopter\n" +
                "hell\n" +
                "hello\n" +
                "helmet\n" +
                "help\n" +
                "help oneself\n" +
                "help sb. out\n" +
                "help sb. with sth.\n" +
                "helpful\n" +
                "helpless\n" +
                "hen\n" +
                "hence\n" +
                "her\n" +
                "herd\n" +
                "here\n" +
                "here and now\n" +
                "here and there\n" +
                "hero\n" +
                "heroic\n" +
                "heroine\n" +
                "hers\n" +
                "herself\n" +
                "hesitate\n" +
                "hi\n" +
                "hide\n" +
                "high\n" +
                "highly\n" +
                "highway\n" +
                "hill\n" +
                "hillside\n" +
                "him\n" +
                "himself\n" +
                "hint\n" +
                "hire\n" +
                "his\n" +
                "historical\n" +
                "history\n" +
                "hit\n" +
                "hobby\n" +
                "hold\n" +
                "hold back\n" +
                "hold down\n" +
                "hold in\n" +
                "hold office\n" +
                "hold on\n" +
                "hold on to\n" +
                "hold one's own\n" +
                "hold oneself in\n" +
                "hold out\n" +
                "hold up\n" +
                "hold water\n" +
                "hold...against\n" +
                "hole\n" +
                "holiday\n" +
                "hollow\n" +
                "holy\n" +
                "home\n" +
                "honest\n" +
                "honesty\n" +
                "honey\n" +
                "honeymoon\n" +
                "honour\n" +
                "honourable\n" +
                "hook\n" +
                "hope\n" +
                "hopeful\n" +
                "hopeless\n" +
                "horizon\n" +
                "horizontal\n" +
                "horn\n" +
                "horror\n" +
                "horse\n" +
                "horsepower\n" +
                "hospital\n" +
                "host\n" +
                "hostess\n" +
                "hostile\n" +
                "hot\n" +
                "hotel\n" +
                "hour\n" +
                "house\n" +
                "household\n" +
                "housewife\n" +
                "how\n" +
                "How about?\n" +
                "however\n" +
                "huge\n" +
                "human\n" +
                "humble\n" +
                "humid\n" +
                "humorous\n" +
                "humour\n" +
                "hundred\n" +
                "hunger\n" +
                "hungry\n" +
                "hunt\n" +
                "hurry\n" +
                "hurry up\n" +
                "hurt\n" +
                "husband\n" +
                "hut\n" +
                "hydrogen\n" +
                "I\n" +
                "i.e.\n" +
                "ice\n" +
                "ice-cream\n" +
                "idea\n" +
                "ideal\n" +
                "identical\n" +
                "identify\n" +
                "identify with\n" +
                "idiom\n" +
                "idle\n" +
                "if\n" +
                "if any\n" +
                "if only\n" +
                "ignorant\n" +
                "ignore\n" +
                "ill\n" +
                "illegal\n" +
                "illness\n" +
                "illustrate\n" +
                "illustration\n" +
                "image\n" +
                "imaginary\n" +
                "imagination\n" +
                "imagine\n" +
                "imitate\n" +
                "immediate\n" +
                "immediately\n" +
                "immense\n" +
                "immigrant\n" +
                "impact\n" +
                "impatient\n" +
                "implication\n" +
                "imply\n" +
                "import\n" +
                "importance\n" +
                "important\n" +
                "impose\n" +
                "impossible\n" +
                "impress\n" +
                "impression\n" +
                "impressive\n" +
                "imprison\n" +
                "improve\n" +
                "improve on\n" +
                "improvement\n" +
                "in\n" +
                "in a hurry\n" +
                "in a moment\n" +
                "in a sense\n" +
                "in a way\n" +
                "in a word\n" +
                "in accordance with\n" +
                "in addition\n" +
                "in addition to\n" +
                "in advance\n" +
                "in advance of\n" +
                "in all\n" +
                "in all directions\n" +
                "in and out\n" +
                "in any case\n" +
                "in any event\n" +
                "in brief\n" +
                "in case\n" +
                "in case of\n" +
                "in charge of\n" +
                "in common\n" +
                "in comparison with\n" +
                "in consequence\n" +
                "in consequence of\n" +
                "in danger\n" +
                "in debt to sb.\n" +
                "in detail\n" +
                "in difficulties\n" +
                "in due course\n" +
                "in effect\n" +
                "in error\n" +
                "in every way\n" +
                "in excess of\n" +
                "in exchange for\n" +
                "in face of\n" +
                "in fact\n" +
                "in faith\n" +
                "in favour of\n" +
                "in focus\n" +
                "in force\n" +
                "in front of\n" +
                "in full\n" +
                "in full swing\n" +
                "in future\n" +
                "in general\n" +
                "in good health\n" +
                "in half\n" +
                "in hand\n" +
                "in itself\n" +
                "in light of\n" +
                "in line\n" +
                "in line with\n" +
                "in memory of\n" +
                "in nature\n" +
                "in no case\n" +
                "in no time\n" +
                "in no way\n" +
                "in one's honour\n" +
                "in order\n" +
                "in order that\n" +
                "in order to\n" +
                "in other words\n" +
                "in part\n" +
                "in particular\n" +
                "in person\n" +
                "in place\n" +
                "in place of\n" +
                "in point of\n" +
                "in practice\n" +
                "in proportion to\n" +
                "in public\n" +
                "in quantity\n" +
                "in question\n" +
                "in regard to\n" +
                "in relation to\n" +
                "in respect that\n" +
                "in return\n" +
                "in return for\n" +
                "in school\n" +
                "in search of\n" +
                "in season\n" +
                "in secret\n" +
                "in session\n" +
                "in short\n" +
                "in sight\n" +
                "in so far as\n" +
                "in spite of\n" +
                "in step\n" +
                "in support of\n" +
                "in tears\n" +
                "in terms of\n" +
                "in that\n" +
                "in the air\n" +
                "in the case of\n" +
                "in the course of\n" +
                "in the dark\n" +
                "in the distance\n" +
                "in the end\n" +
                "in the event of\n" +
                "in the first place\n" +
                "in the future\n" +
                "in the heat of\n" +
                "in the interest of\n" +
                "in the least\n" +
                "in the long run\n" +
                "in the main\n" +
                "in the mass\n" +
                "in the name of\n" +
                "in the nature of\n" +
                "in the negative\n" +
                "in the open\n" +
                "in the past\n" +
                "in the shape of\n" +
                "in the way\n" +
                "in the way of\n" +
                "in the world\n" +
                "in this case\n" +
                "in time\n" +
                "in touch\n" +
                "in truth\n" +
                "in turn\n" +
                "in use\n" +
                "in vain\n" +
                "in view of\n" +
                "inch\n" +
                "incident\n" +
                "incline\n" +
                "include\n" +
                "income\n" +
                "incorrect\n" +
                "increase\n" +
                "increasingly\n" +
                "indeed\n" +
                "indefinite\n" +
                "independence\n" +
                "independent\n" +
                "index\n" +
                "India\n" +
                "Indian\n" +
                "indicate\n" +
                "indication\n" +
                "indifferent\n" +
                "indignant\n" +
                "indirect\n" +
                "indispensable\n" +
                "individual\n" +
                "indoors\n" +
                "industrial\n" +
                "industrialize\n" +
                "industry\n" +
                "inefficient\n" +
                "inevitable\n" +
                "inexpensive\n" +
                "infant\n" +
                "infect\n" +
                "infer\n" +
                "inferior\n" +
                "infinite\n" +
                "influence\n" +
                "influential\n" +
                "inform\n" +
                "information\n" +
                "inhabit\n" +
                "inhabitant\n" +
                "inherit\n" +
                "initial\n" +
                "injection\n" +
                "injure\n" +
                "injury\n" +
                "ink\n" +
                "inn\n" +
                "inner\n" +
                "innocent\n" +
                "input\n" +
                "inquire\n" +
                "inquire about\n" +
                "inquire after\n" +
                "inquire for\n" +
                "inquiry\n" +
                "insect\n" +
                "insert\n" +
                "inside\n" +
                "insist\n" +
                "inspect\n" +
                "inspection\n" +
                "inspire\n" +
                "install\n" +
                "installation\n" +
                "instance\n" +
                "instant\n" +
                "instantly\n" +
                "instead\n" +
                "instead of\n" +
                "instinct\n" +
                "institute\n" +
                "institution\n" +
                "instruct\n" +
                "instruction\n" +
                "instrument\n" +
                "insufficient\n" +
                "insult\n" +
                "insurance\n" +
                "insure\n" +
                "intellectual\n" +
                "intelligence\n" +
                "intelligent\n" +
                "intend\n" +
                "intense\n" +
                "intensity\n" +
                "intensive\n" +
                "intention\n" +
                "intentional\n" +
                "interaction\n" +
                "interest\n" +
                "interesting\n" +
                "interfere\n" +
                "interfere in\n" +
                "interfere with\n" +
                "interference\n" +
                "interior\n" +
                "intermediate\n" +
                "internal\n" +
                "international\n" +
                "interpret\n" +
                "interpretation\n" +
                "interpreter\n" +
                "interrupt\n" +
                "interruption\n" +
                "interval\n" +
                "interview\n" +
                "intimate\n" +
                "into\n" +
                "introduce\n" +
                "introduction\n" +
                "invade\n" +
                "invasion\n" +
                "invent\n" +
                "invention\n" +
                "inventor\n" +
                "invest\n" +
                "investigate\n" +
                "investigation\n" +
                "investment\n" +
                "invisible\n" +
                "invitation\n" +
                "invite\n" +
                "involve\n" +
                "inward\n" +
                "iron\n" +
                "irregular\n" +
                "island\n" +
                "isolate\n" +
                "issue\n" +
                "it\n" +
                "Italian\n" +
                "item\n" +
                "its\n" +
                "itself\n" +
                "jacket\n" +
                "jail\n" +
                "jam\n" +
                "January\n" +
                "Japan\n" +
                "Japanese\n" +
                "jar\n" +
                "jaw\n" +
                "jazz\n" +
                "jealous\n" +
                "jet\n" +
                "jet lag\n" +
                "jewel\n" +
                "jewish\n" +
                "job\n" +
                "join\n" +
                "join hands with\n" +
                "join in\n" +
                "join up\n" +
                "joint\n" +
                "joke\n" +
                "jolly\n" +
                "journal\n" +
                "journalist\n" +
                "journey\n" +
                "joy\n" +
                "joyful\n" +
                "judge\n" +
                "judgement\n" +
                "judging by\n" +
                "juice\n" +
                "July\n" +
                "jump\n" +
                "jump at\n" +
                "jump off\n" +
                "June\n" +
                "jungle\n" +
                "junior\n" +
                "jury\n" +
                "just\n" +
                "just about\n" +
                "just as\n" +
                "just now\n" +
                "just the same\n" +
                "justice\n" +
                "justify\n" +
                "keen\n" +
                "keep\n" +
                "keep an eye on\n" +
                "keep away\n" +
                "keep back\n" +
                "keep company with\n" +
                "keep down\n" +
                "keep early hours\n" +
                "keep faith\n" +
                "keep friends with\n" +
                "keep from\n" +
                "keep house\n" +
                "keep in mind\n" +
                "keep in touch\n" +
                "keep off\n" +
                "keep on\n" +
                "keep on good terms\n" +
                "keep one's balance\n" +
                "keep one's eyes open\n" +
                "keep one's head\n" +
                "keep one's mind on\n" +
                "keep one's temper\n" +
                "keep one's word\n" +
                "keep out of\n" +
                "keep pace with\n" +
                "keep silence\n" +
                "keep sth. secret\n" +
                "keep terms with sb.\n" +
                "keep to\n" +
                "keep to oneself\n" +
                "keep under\n" +
                "keep up\n" +
                "keep up with\n" +
                "keeper\n" +
                "kettle\n" +
                "key\n" +
                "keyboard\n" +
                "kick\n" +
                "kid\n" +
                "kill\n" +
                "kill off\n" +
                "kilogram\n" +
                "kilometre\n" +
                "kind\n" +
                "kind of\n" +
                "kindness\n" +
                "king\n" +
                "kingdom\n" +
                "kiss\n" +
                "kitchen\n" +
                "kite\n" +
                "knee\n" +
                "kneel\n" +
                "knife\n" +
                "knit\n" +
                "knob\n" +
                "knock\n" +
                "knock down\n" +
                "knock off\n" +
                "knock out\n" +
                "knot\n" +
                "know\n" +
                "know about\n" +
                "know better than\n" +
                "knowledge\n" +
                "lab\n" +
                "label\n" +
                "laboratory\n" +
                "labour\n" +
                "labour along\n" +
                "lace\n" +
                "lack\n" +
                "ladder\n" +
                "lady\n" +
                "lag\n" +
                "lake\n" +
                "lamb\n" +
                "lame\n" +
                "lamp\n" +
                "land\n" +
                "landing\n" +
                "landlady\n" +
                "landlord\n" +
                "lane\n" +
                "language\n" +
                "lantern\n" +
                "lap\n" +
                "large\n" +
                "largely\n" +
                "laser\n" +
                "last\n" +
                "late\n" +
                "lately\n" +
                "later\n" +
                "Latin\n" +
                "latter\n" +
                "laugh\n" +
                "laugh at\n" +
                "laugh off\n" +
                "laugh over\n" +
                "laughter\n" +
                "launch\n" +
                "launch out\n" +
                "laundry\n" +
                "lavatory\n" +
                "law\n" +
                "lawn\n" +
                "lawyer\n" +
                "lay\n" +
                "lay aside\n" +
                "lay down\n" +
                "lay hold of\n" +
                "lay off\n" +
                "lay out\n" +
                "lay over\n" +
                "lay up\n" +
                "layer\n" +
                "layout\n" +
                "lazy\n" +
                "lead\n" +
                "lead the way\n" +
                "lead to\n" +
                "lead up to\n" +
                "leader\n" +
                "leadership\n" +
                "leading\n" +
                "leaf\n" +
                "league\n" +
                "leak\n" +
                "lean\n" +
                "leap\n" +
                "learn\n" +
                "learn by heart\n" +
                "learn from\n" +
                "learn of\n" +
                "learn off\n" +
                "learned\n" +
                "learning\n" +
                "least\n" +
                "leather\n" +
                "leave\n" +
                "leave alone\n" +
                "leave behind\n" +
                "leave off\n" +
                "leave out\n" +
                "lecture\n" +
                "left\n" +
                "leg\n" +
                "legal\n" +
                "legend\n" +
                "leisure\n" +
                "lemon\n" +
                "lend\n" +
                "length\n" +
                "lens\n" +
                "less\n" +
                "lessen\n" +
                "lesson\n" +
                "lest\n" +
                "let\n" +
                "let alone\n" +
                "let down\n" +
                "let go\n" +
                "let in\n" +
                "let off\n" +
                "let out\n" +
                "let up\n" +
                "letter\n" +
                "level\n" +
                "lever\n" +
                "liable\n" +
                "liar\n" +
                "liberal\n" +
                "liberate\n" +
                "liberation\n" +
                "liberty\n" +
                "librarian\n" +
                "library\n" +
                "license\n" +
                "lick\n" +
                "lid\n" +
                "lie\n" +
                "lie down\n" +
                "lie in\n" +
                "lie on\n" +
                "lie over\n" +
                "lie up\n" +
                "lieutenant\n" +
                "life\n" +
                "lifetime\n" +
                "lift\n" +
                "light\n" +
                "light up\n" +
                "lighten\n" +
                "lightly\n" +
                "lightning\n" +
                "like\n" +
                "like any thing\n" +
                "likely\n" +
                "likewise\n" +
                "limb\n" +
                "limber up\n" +
                "lime\n" +
                "limit\n" +
                "limitation\n" +
                "limited\n" +
                "line\n" +
                "line up\n" +
                "linen\n" +
                "liner\n" +
                "link\n" +
                "link up\n" +
                "lion\n" +
                "lip\n" +
                "liquid\n" +
                "liquor\n" +
                "list\n" +
                "listen\n" +
                "listen for\n" +
                "listen into\n" +
                "listen to\n" +
                "listener\n" +
                "liter\n" +
                "literary\n" +
                "literature\n" +
                "little\n" +
                "little by little\n" +
                "live\n" +
                "live off\n" +
                "live on\n" +
                "live out\n" +
                "live through\n" +
                "live up to\n" +
                "live with\n" +
                "lively\n" +
                "liver\n" +
                "living\n" +
                "living-room\n" +
                "load\n" +
                "loaf\n" +
                "loan\n" +
                "local\n" +
                "locate\n" +
                "location\n" +
                "lock\n" +
                "lock oneself in\n" +
                "lock out\n" +
                "locomotive\n" +
                "lodge\n" +
                "log\n" +
                "logic\n" +
                "logical\n" +
                "lonely\n" +
                "long\n" +
                "long before\n" +
                "long for\n" +
                "long since\n" +
                "look\n" +
                "look after\n" +
                "look at\n" +
                "look back\n" +
                "look black\n" +
                "look down on\n" +
                "look for\n" +
                "look forward to\n" +
                "look in\n" +
                "look into\n" +
                "look on\n" +
                "look out\n" +
                "look over\n" +
                "look round\n" +
                "look through\n" +
                "look to\n" +
                "look up\n" +
                "look up to sb.\n" +
                "loop\n" +
                "loose\n" +
                "loosen\n" +
                "lord\n" +
                "lorry\n" +
                "lose\n" +
                "lose heart\n" +
                "lose no time\n" +
                "lose one's hair\n" +
                "lose one's head\n" +
                "lose one's heart to\n" +
                "lose one's nerves\n" +
                "lose one's temper\n" +
                "lose sight of\n" +
                "loss\n" +
                "lost one's balance\n" +
                "lot\n" +
                "lots and lots\n" +
                "lots of\n" +
                "loud\n" +
                "loudspeaker\n" +
                "love\n" +
                "lovely\n" +
                "lover\n" +
                "low\n" +
                "lower\n" +
                "loyal\n" +
                "loyalty\n" +
                "luck\n" +
                "lucky\n" +
                "luggage\n" +
                "lumber\n" +
                "lump\n" +
                "lunch\n" +
                "lung\n" +
                "luxury\n" +
                "machine\n" +
                "mad\n" +
                "madam\n" +
                "made up of\n" +
                "magazine\n" +
                "magic\n" +
                "magnet\n" +
                "magnetic\n" +
                "magnificent\n" +
                "maid\n" +
                "mail\n" +
                "main\n" +
                "mainland\n" +
                "mainly\n" +
                "maintain\n" +
                "maintenance\n" +
                "major\n" +
                "major in\n" +
                "majority\n" +
                "make\n" +
                "make a deal with\n" +
                "make a difference\n" +
                "make a display of\n" +
                "make a face\n" +
                "make a mess of\n" +
                "make a note of\n" +
                "make as if\n" +
                "make away\n" +
                "make away with\n" +
                "make beds\n" +
                "make believe\n" +
                "make certain\n" +
                "make down\n" +
                "make for\n" +
                "make friends with\n" +
                "make fun of\n" +
                "make light of\n" +
                "make love to\n" +
                "make mention of\n" +
                "make much of\n" +
                "make no difficulties\n" +
                "make off with\n" +
                "make one's own way\n" +
                "make one's way\n" +
                "make out\n" +
                "make out of\n" +
                "make over\n" +
                "make peace with\n" +
                "make progress with\n" +
                "make room for sb.\n" +
                "make sense\n" +
                "make sure\n" +
                "make terms\n" +
                "make the best of\n" +
                "make the most of\n" +
                "make up\n" +
                "make up for\n" +
                "make up one's mind\n" +
                "make up to\n" +
                "make use of\n" +
                "make way\n" +
                "male\n" +
                "man\n" +
                "manage\n" +
                "management\n" +
                "manager\n" +
                "mankind\n" +
                "manly\n" +
                "manner\n" +
                "manual\n" +
                "manufacture\n" +
                "manufacturer\n" +
                "many\n" +
                "many a\n" +
                "map\n" +
                "marble\n" +
                "march\n" +
                "margin\n" +
                "marine\n" +
                "mark\n" +
                "mark down\n" +
                "mark off\n" +
                "mark out\n" +
                "mark out for\n" +
                "mark time\n" +
                "mark up\n" +
                "market\n" +
                "marriage\n" +
                "married\n" +
                "marry\n" +
                "marvellous\n" +
                "Marxism\n" +
                "Marxist\n" +
                "mask\n" +
                "mass\n" +
                "master\n" +
                "masterpiece\n" +
                "mat\n" +
                "match\n" +
                "mate\n" +
                "material\n" +
                "materialism\n" +
                "mathematical\n" +
                "mathematics\n" +
                "maths\n" +
                "matter\n" +
                "mature\n" +
                "maximum\n" +
                "May\n" +
                "may as well\n" +
                "maybe\n" +
                "mayor\n" +
                "me\n" +
                "meadow\n" +
                "meal\n" +
                "mean\n" +
                "mean business\n" +
                "meaning\n" +
                "means\n" +
                "meantime\n" +
                "meanwhile\n" +
                "measurable\n" +
                "measure\n" +
                "measure up\n" +
                "measure up to\n" +
                "measurement\n" +
                "meat\n" +
                "mechanic\n" +
                "mechanical\n" +
                "mechanically\n" +
                "mechanics\n" +
                "medal\n" +
                "medical\n" +
                "medicine\n" +
                "Mediterranean\n" +
                "medium\n" +
                "meet\n" +
                "meet up with\n" +
                "meet with\n" +
                "meeting\n" +
                "melon\n" +
                "melt\n" +
                "member\n" +
                "memorial\n" +
                "memory\n" +
                "mend\n" +
                "mental\n" +
                "mention\n" +
                "menu\n" +
                "merchant\n" +
                "Mercury\n" +
                "mercy\n" +
                "mere\n" +
                "merely\n" +
                "merit\n" +
                "merry\n" +
                "mess\n" +
                "message\n" +
                "messenger\n" +
                "metal\n" +
                "meter\n" +
                "method\n" +
                "metre\n" +
                "metric\n" +
                "microcomputer\n" +
                "microphone\n" +
                "microscope\n" +
                "midday\n" +
                "middle\n" +
                "midnight\n" +
                "midst\n" +
                "might\n" +
                "mild\n" +
                "mile\n" +
                "military\n" +
                "milk\n" +
                "mill\n" +
                "millimetre\n" +
                "million\n" +
                "mind\n" +
                "mind you\n" +
                "mine\n" +
                "miner\n" +
                "mineral\n" +
                "minimum\n" +
                "minister\n" +
                "ministry\n" +
                "minor\n" +
                "minority\n" +
                "minus\n" +
                "minute\n" +
                "miracle\n" +
                "mirror\n" +
                "miserable\n" +
                "mislead\n" +
                "miss\n" +
                "missile\n" +
                "missing\n" +
                "mission\n" +
                "mist\n" +
                "mistake\n" +
                "mistake for\n" +
                "Mister\n" +
                "mistress\n" +
                "misunderstand\n" +
                "mix\n" +
                "mix up\n" +
                "mixture\n" +
                "moan\n" +
                "mobile\n" +
                "mode\n" +
                "model\n" +
                "moderate\n" +
                "modern\n" +
                "modest\n" +
                "modify\n" +
                "moist\n" +
                "moisture\n" +
                "molecule\n" +
                "moment\n" +
                "Monday\n" +
                "money\n" +
                "monitor\n" +
                "monkey\n" +
                "month\n" +
                "monthly\n" +
                "monument\n" +
                "mood\n" +
                "moon\n" +
                "moral\n" +
                "more\n" +
                "more often than not\n" +
                "more or less\n" +
                "more than ever\n" +
                "moreover\n" +
                "morning\n" +
                "mortal\n" +
                "mosquito\n" +
                "most\n" +
                "mostly\n" +
                "mother\n" +
                "motion\n" +
                "motivate\n" +
                "motive\n" +
                "motor\n" +
                "mould\n" +
                "mount\n" +
                "mountain\n" +
                "mourn\n" +
                "mouse\n" +
                "mouth\n" +
                "mouthful\n" +
                "move\n" +
                "move about\n" +
                "move off\n" +
                "move on\n" +
                "movement\n" +
                "movie\n" +
                "much\n" +
                "much less\n" +
                "much more\n" +
                "mud\n" +
                "muddy\n" +
                "mug\n" +
                "multiple\n" +
                "multiply\n" +
                "murder\n" +
                "murderer\n" +
                "muscle\n" +
                "museum\n" +
                "mushroom\n" +
                "music\n" +
                "musical\n" +
                "musician\n" +
                "must\n" +
                "mute\n" +
                "mutter\n" +
                "mutton\n" +
                "mutual\n" +
                "my\n" +
                "myself\n" +
                "mysterious\n" +
                "mystery\n" +
                "nail\n" +
                "nail up\n" +
                "naked\n" +
                "name\n" +
                "name after\n" +
                "namely\n" +
                "nap\n" +
                "narrow\n" +
                "nasty\n" +
                "nation\n" +
                "national\n" +
                "nationality\n" +
                "native\n" +
                "natural\n" +
                "naturally\n" +
                "nature\n" +
                "naughty\n" +
                "naval\n" +
                "navigation\n" +
                "navy\n" +
                "near\n" +
                "near by\n" +
                "near to\n" +
                "nearby\n" +
                "nearly\n" +
                "neat\n" +
                "necessarily\n" +
                "necessary\n" +
                "necessity\n" +
                "neck\n" +
                "necklace\n" +
                "need\n" +
                "needle\n" +
                "needless\n" +
                "negative\n" +
                "neglect\n" +
                "Negro\n" +
                "neighbour\n" +
                "neighbourhood\n" +
                "neither\n" +
                "neither...nor...\n" +
                "nephew\n" +
                "nerve\n" +
                "nervous\n" +
                "nest\n" +
                "net\n" +
                "network\n" +
                "neutral\n" +
                "never\n" +
                "never mind\n" +
                "nevertheless\n" +
                "new\n" +
                "newly\n" +
                "news\n" +
                "newspaper\n" +
                "next\n" +
                "next door\n" +
                "nice\n" +
                "niece\n" +
                "night\n" +
                "night after night\n" +
                "night and day\n" +
                "nine\n" +
                "nineteen\n" +
                "ninety\n" +
                "ninth\n" +
                "nitrogen\n" +
                "no\n" +
                "no doubt\n" +
                "no fewer than\n" +
                "no later than\n" +
                "no less than\n" +
                "no longer\n" +
                "no matter\n" +
                "no more\n" +
                "no more than\n" +
                "no more...than...\n" +
                "no other than\n" +
                "no sooner...than\n" +
                "no thanks to\n" +
                "no wonder...\n" +
                "noble\n" +
                "nobody\n" +
                "nod\n" +
                "noise\n" +
                "noisy\n" +
                "none\n" +
                "none but\n" +
                "none other than\n" +
                "none the less\n" +
                "none too\n" +
                "nonsense\n" +
                "noon\n" +
                "nor\n" +
                "normal\n" +
                "normally\n" +
                "north\n" +
                "northeast\n" +
                "northern\n" +
                "northwest\n" +
                "nose\n" +
                "not\n" +
                "not a little\n" +
                "not as...as...\n" +
                "not at all\n" +
                "not but that\n" +
                "not in the least\n" +
                "not more than\n" +
                "not much of a\n" +
                "not nearly\n" +
                "not only...but\n" +
                "not so much...as...\n" +
                "not think much of\n" +
                "not to mention\n" +
                "note\n" +
                "notebook\n" +
                "nothing\n" +
                "nothing but\n" +
                "notice\n" +
                "noticeable\n" +
                "noun\n" +
                "novel\n" +
                "November\n" +
                "now\n" +
                "now and then\n" +
                "now that\n" +
                "nowadays\n" +
                "nowhere\n" +
                "nuclear\n" +
                "nucleus\n" +
                "nuisance\n" +
                "number\n" +
                "numerous\n" +
                "nurse\n" +
                "nursery\n" +
                "nut\n" +
                "nylon\n" +
                "o'clock\n" +
                "oak\n" +
                "oar\n" +
                "obey\n" +
                "object\n" +
                "objection\n" +
                "objective\n" +
                "oblige\n" +
                "observation\n" +
                "observe\n" +
                "observer\n" +
                "obstacle\n" +
                "obtain\n" +
                "obvious\n" +
                "obviously\n" +
                "occasion\n" +
                "occasional\n" +
                "occasionally\n" +
                "occupation\n" +
                "occupy\n" +
                "occur\n" +
                "occur to\n" +
                "occurrence\n" +
                "ocean\n" +
                "Oceania\n" +
                "October\n" +
                "odd\n" +
                "odour\n" +
                "of\n" +
                "of course\n" +
                "of importance\n" +
                "of itself\n" +
                "of late years\n" +
                "of one's own\n" +
                "off\n" +
                "off and on\n" +
                "off balance\n" +
                "off duty\n" +
                "offend\n" +
                "offer\n" +
                "office\n" +
                "officer\n" +
                "official\n" +
                "often\n" +
                "oh\n" +
                "oil\n" +
                "okay\n" +
                "old\n" +
                "omit\n" +
                "on\n" +
                "on a large scale\n" +
                "on a level with\n" +
                "on a small scale\n" +
                "on account of\n" +
                "on an average\n" +
                "on balance\n" +
                "on behalf of\n" +
                "on board\n" +
                "on business\n" +
                "on condition that\n" +
                "on credit\n" +
                "on display\n" +
                "on duty\n" +
                "on earth\n" +
                "on end\n" +
                "on fire\n" +
                "on foot\n" +
                "on guard\n" +
                "on hand\n" +
                "on no account\n" +
                "on occasion\n" +
                "on one's guard\n" +
                "on one's own\n" +
                "on principle\n" +
                "on purpose\n" +
                "on relief\n" +
                "on sale\n" +
                "on schedule\n" +
                "on second thoughts\n" +
                "on the contrary\n" +
                "on the grounds of\n" +
                "on the lips of\n" +
                "on the nail\n" +
                "on the principle of\n" +
                "on the road\n" +
                "on the run\n" +
                "on the side\n" +
                "on the spot\n" +
                "on the stroke\n" +
                "on the table\n" +
                "on the turn\n" +
                "on the whole\n" +
                "on time\n" +
                "on top of\n" +
                "on view\n" +
                "once\n" +
                "once for all\n" +
                "once in a while\n" +
                "once more\n" +
                "once upon a time\n" +
                "one\n" +
                "one after another\n" +
                "one another\n" +
                "one day\n" +
                "oneself\n" +
                "onion\n" +
                "only\n" +
                "only that\n" +
                "only too\n" +
                "onto\n" +
                "open\n" +
                "open out\n" +
                "opening\n" +
                "opera\n" +
                "operate\n" +
                "operation\n" +
                "operational\n" +
                "operator\n" +
                "opinion\n" +
                "opponent\n" +
                "opportunity\n" +
                "oppose\n" +
                "opposite\n" +
                "oppress\n" +
                "optical\n" +
                "optimistic\n" +
                "option\n" +
                "optional\n" +
                "or\n" +
                "or else\n" +
                "or rather\n" +
                "or so\n" +
                "oral\n" +
                "orange\n" +
                "orbit\n" +
                "orchestra\n" +
                "order\n" +
                "orderly\n" +
                "ordinary\n" +
                "ore\n" +
                "organ\n" +
                "organic\n" +
                "organism\n" +
                "organization\n" +
                "organize\n" +
                "oriental\n" +
                "origin\n" +
                "original\n" +
                "ornament\n" +
                "orphan\n" +
                "other\n" +
                "other than\n" +
                "otherwise\n" +
                "ought\n" +
                "ounce\n" +
                "our\n" +
                "ours\n" +
                "ourselves\n" +
                "out\n" +
                "out of\n" +
                "out of breath\n" +
                "out of control\n" +
                "out of danger\n" +
                "out of date\n" +
                "out of debt\n" +
                "out of doors\n" +
                "out of favour\n" +
                "out of focus\n" +
                "out of order\n" +
                "out of place\n" +
                "out of practice\n" +
                "out of proportion\n" +
                "out of question\n" +
                "out of sight\n" +
                "out of the question\n" +
                "out of touch\n" +
                "out of work\n" +
                "outcome\n" +
                "outdoor\n" +
                "outdoors\n" +
                "outer\n" +
                "outlet\n" +
                "outline\n" +
                "outlook\n" +
                "output\n" +
                "outset\n" +
                "outside\n" +
                "outskirt\n" +
                "outstanding\n" +
                "outward\n" +
                "outwards\n" +
                "oven\n" +
                "over\n" +
                "over and above\n" +
                "over and over\n" +
                "over there\n" +
                "overall\n" +
                "overcoat\n" +
                "overcome\n" +
                "overhead\n" +
                "overlook\n" +
                "overnight\n" +
                "overseas\n" +
                "overtake\n" +
                "overtime\n" +
                "owe\n" +
                "owing to\n" +
                "owl\n" +
                "own\n" +
                "owner\n" +
                "ownership\n" +
                "ox\n" +
                "P.M.\n" +
                "pace\n" +
                "pacific\n" +
                "pack\n" +
                "package\n" +
                "packet\n" +
                "pad\n" +
                "page\n" +
                "pail\n" +
                "pain\n" +
                "painful\n" +
                "paint\n" +
                "painter\n" +
                "painting\n" +
                "pair\n" +
                "palace\n" +
                "pale\n" +
                "palm\n" +
                "pan\n" +
                "panda\n" +
                "pane\n" +
                "panel\n" +
                "pant\n" +
                "paper\n" +
                "parade\n" +
                "paradise\n" +
                "paragraph\n" +
                "parallel\n" +
                "parcel\n" +
                "pardon\n" +
                "parent\n" +
                "park\n" +
                "parliament\n" +
                "part\n" +
                "partial\n" +
                "partially\n" +
                "participate\n" +
                "particle\n" +
                "particular\n" +
                "particularly\n" +
                "partly\n" +
                "partner\n" +
                "party\n" +
                "pass\n" +
                "pass away\n" +
                "pass by\n" +
                "pass on\n" +
                "pass out\n" +
                "pass through\n" +
                "passage\n" +
                "passenger\n" +
                "passion\n" +
                "passive\n" +
                "passport\n" +
                "past\n" +
                "paste\n" +
                "pastime\n" +
                "pat\n" +
                "pat sb. on the back\n" +
                "patch\n" +
                "path\n" +
                "patience\n" +
                "patient\n" +
                "pattern\n" +
                "pause\n" +
                "pave\n" +
                "pavement\n" +
                "paw\n" +
                "pay\n" +
                "pay attention to\n" +
                "pay back\n" +
                "pay for\n" +
                "pay off\n" +
                "pay out\n" +
                "pay respect to\n" +
                "pay up\n" +
                "payment\n" +
                "pea\n" +
                "peace\n" +
                "peaceful\n" +
                "peach\n" +
                "peak\n" +
                "pear\n" +
                "pearl\n" +
                "peasant\n" +
                "pebble\n" +
                "peculiar\n" +
                "peel\n" +
                "peep\n" +
                "pen\n" +
                "pencil\n" +
                "penetrate\n" +
                "peninsula\n" +
                "penny\n" +
                "pension\n" +
                "people\n" +
                "pepper\n" +
                "per\n" +
                "per cent\n" +
                "perceive\n" +
                "percent\n" +
                "percentage\n" +
                "perfect\n" +
                "perfectly\n" +
                "perform\n" +
                "performance\n" +
                "perfume\n" +
                "perhaps\n" +
                "period\n" +
                "permanent\n" +
                "permanently\n" +
                "permission\n" +
                "permit\n" +
                "persist\n" +
                "person\n" +
                "personal\n" +
                "personnel\n" +
                "perspective\n" +
                "persuade\n" +
                "pessimistic\n" +
                "pet\n" +
                "petrol\n" +
                "petroleum\n" +
                "phase\n" +
                "phenomenon\n" +
                "philosopher\n" +
                "philosophy\n" +
                "phone\n" +
                "photograph\n" +
                "photographic\n" +
                "phrase\n" +
                "physical\n" +
                "physician\n" +
                "physicist\n" +
                "physics\n" +
                "piano\n" +
                "pick\n" +
                "pick off\n" +
                "pick out\n" +
                "pick up\n" +
                "picnic\n" +
                "picture\n" +
                "pie\n" +
                "piece\n" +
                "piece together\n" +
                "piece up\n" +
                "pierce\n" +
                "pig\n" +
                "pigeon\n" +
                "pile\n" +
                "pile up\n" +
                "pill\n" +
                "pillar\n" +
                "pillow\n" +
                "pilot\n" +
                "pin\n" +
                "pinch\n" +
                "pine\n" +
                "pink\n" +
                "pint\n" +
                "pioneer\n" +
                "pipe\n" +
                "pipeline\n" +
                "pistol\n" +
                "pit\n" +
                "pitch\n" +
                "pity\n" +
                "place\n" +
                "plain\n" +
                "plan\n" +
                "plane\n" +
                "planet\n" +
                "plant\n" +
                "plantation\n" +
                "plaster\n" +
                "plastic\n" +
                "plate\n" +
                "platform\n" +
                "play\n" +
                "play a joke on sb.\n" +
                "play a part\n" +
                "play the devil with\n" +
                "play with\n" +
                "player\n" +
                "playground\n" +
                "pleasant\n" +
                "please\n" +
                "pleasure\n" +
                "plentiful\n" +
                "plenty\n" +
                "plot\n" +
                "plough\n" +
                "pluck\n" +
                "plug\n" +
                "plunge\n" +
                "plural\n" +
                "plus\n" +
                "pocket\n" +
                "poem\n" +
                "poet\n" +
                "poetry\n" +
                "point\n" +
                "point for point\n" +
                "point out\n" +
                "point to\n" +
                "poison\n" +
                "poisonous\n" +
                "pole\n" +
                "police\n" +
                "policeman\n" +
                "policy\n" +
                "polish\n" +
                "polite\n" +
                "political\n" +
                "politician\n" +
                "politics\n" +
                "pollute\n" +
                "pollution\n" +
                "pond\n" +
                "pool\n" +
                "poor\n" +
                "pop\n" +
                "popular\n" +
                "population\n" +
                "porch\n" +
                "pork\n" +
                "porridge\n" +
                "port\n" +
                "portable\n" +
                "porter\n" +
                "portion\n" +
                "portrait\n" +
                "Portuguese\n" +
                "position\n" +
                "positive\n" +
                "possess\n" +
                "possession\n" +
                "possibility\n" +
                "possible\n" +
                "possibly\n" +
                "post\n" +
                "postage\n" +
                "postman\n" +
                "postpone\n" +
                "pot\n" +
                "potato\n" +
                "potential\n" +
                "pound\n" +
                "pour\n" +
                "poverty\n" +
                "powder\n" +
                "power\n" +
                "powerful\n" +
                "practical\n" +
                "practically\n" +
                "practice\n" +
                "practise\n" +
                "praise\n" +
                "pray\n" +
                "prayer\n" +
                "precaution\n" +
                "preceding\n" +
                "precious\n" +
                "precise\n" +
                "precision\n" +
                "predict\n" +
                "preface\n" +
                "prefer\n" +
                "preferable\n" +
                "preference\n" +
                "prejudice\n" +
                "preliminary\n" +
                "premier\n" +
                "preparation\n" +
                "prepare\n" +
                "preposition\n" +
                "prescribe\n" +
                "presence\n" +
                "present\n" +
                "presently\n" +
                "preserve\n" +
                "preserve from\n" +
                "president\n" +
                "press\n" +
                "press for\n" +
                "pressure\n" +
                "pretend\n" +
                "pretty\n" +
                "prevail\n" +
                "prevail over\n" +
                "prevent\n" +
                "prevent...from...\n" +
                "previous\n" +
                "previously\n" +
                "price\n" +
                "pride\n" +
                "priest\n" +
                "primarily\n" +
                "primary\n" +
                "prime\n" +
                "primitive\n" +
                "prince\n" +
                "princess\n" +
                "principal\n" +
                "principle\n" +
                "print\n" +
                "prior\n" +
                "prior to\n" +
                "prison\n" +
                "prisoner\n" +
                "private\n" +
                "privilege\n" +
                "prize\n" +
                "probability\n" +
                "probable\n" +
                "probably\n" +
                "problem\n" +
                "procedure\n" +
                "proceed\n" +
                "process\n" +
                "procession\n" +
                "proclaim\n" +
                "produce\n" +
                "product\n" +
                "production\n" +
                "productive\n" +
                "profession\n" +
                "professional\n" +
                "professor\n" +
                "profit\n" +
                "program\n" +
                "progress\n" +
                "progressive\n" +
                "prohibit\n" +
                "project\n" +
                "prominent\n" +
                "promise\n" +
                "promising\n" +
                "promote\n" +
                "prompt\n" +
                "pronoun\n" +
                "pronounce\n" +
                "pronunciation\n" +
                "proof\n" +
                "proper\n" +
                "properly\n" +
                "property\n" +
                "proportion\n" +
                "proportional\n" +
                "proposal\n" +
                "propose\n" +
                "prospect\n" +
                "prosperity\n" +
                "prosperous\n" +
                "protect\n" +
                "protect...from\n" +
                "protection\n" +
                "protective\n" +
                "protein\n" +
                "protest\n" +
                "proud\n" +
                "prove\n" +
                "provide\n" +
                "provided\n" +
                "province\n" +
                "provision\n" +
                "psychological\n" +
                "public\n" +
                "publication\n" +
                "publish\n" +
                "pudding\n" +
                "puff\n" +
                "pull\n" +
                "pull down\n" +
                "pull in\n" +
                "pull into\n" +
                "pull off\n" +
                "pull on\n" +
                "pull out\n" +
                "pull through\n" +
                "pull to pieces\n" +
                "pull up\n" +
                "pulse\n" +
                "pump\n" +
                "punch\n" +
                "punctual\n" +
                "punish\n" +
                "punishment\n" +
                "pupil\n" +
                "puppet\n" +
                "purchase\n" +
                "pure\n" +
                "purely\n" +
                "purify\n" +
                "purity\n" +
                "purple\n" +
                "purpose\n" +
                "purse\n" +
                "pursue\n" +
                "pursuit\n" +
                "push\n" +
                "put\n" +
                "put across\n" +
                "put aside\n" +
                "put away\n" +
                "put down\n" +
                "put forward\n" +
                "put in\n" +
                "put into practice\n" +
                "put off\n" +
                "put on\n" +
                "put out\n" +
                "put out of action\n" +
                "put through\n" +
                "put to\n" +
                "put to the test\n" +
                "put to use\n" +
                "put up\n" +
                "put up with\n" +
                "put...in force\n" +
                "puzzle\n" +
                "qualify\n" +
                "quality\n" +
                "quantity\n" +
                "quarrel\n" +
                "quarrel with\n" +
                "quart\n" +
                "quarter\n" +
                "quarterly\n" +
                "queen\n" +
                "queer\n" +
                "question\n" +
                "queue\n" +
                "queue up\n" +
                "quick\n" +
                "quicken\n" +
                "quickly\n" +
                "quiet\n" +
                "quilt\n" +
                "quit\n" +
                "quite\n" +
                "quite a few\n" +
                "quiz\n" +
                "quotation\n" +
                "quote\n" +
                "rabbit\n" +
                "race\n" +
                "racial\n" +
                "rack\n" +
                "racket\n" +
                "radar\n" +
                "radiate\n" +
                "radiation\n" +
                "radio\n" +
                "radioactive\n" +
                "radioactivity\n" +
                "radish\n" +
                "radium\n" +
                "radius\n" +
                "rag\n" +
                "rage\n" +
                "raid\n" +
                "rail\n" +
                "railroad\n" +
                "railway\n" +
                "rain\n" +
                "rain cats and dogs\n" +
                "rain out\n" +
                "rainbow\n" +
                "rainy\n" +
                "raise\n" +
                "rake\n" +
                "range\n" +
                "rank\n" +
                "rapid\n" +
                "rapidly\n" +
                "rare\n" +
                "rarely\n" +
                "rat\n" +
                "rate\n" +
                "rather\n" +
                "rather than\n" +
                "rather too\n" +
                "ratio\n" +
                "rational\n" +
                "raw\n" +
                "ray\n" +
                "razor\n" +
                "reach\n" +
                "reach out\n" +
                "react\n" +
                "react against\n" +
                "react on\n" +
                "react to\n" +
                "reaction\n" +
                "read\n" +
                "reader\n" +
                "readily\n" +
                "reading\n" +
                "ready\n" +
                "real\n" +
                "reality\n" +
                "realize\n" +
                "really\n" +
                "realm\n" +
                "reap\n" +
                "rear\n" +
                "reason\n" +
                "reasonable\n" +
                "rebel\n" +
                "rebellion\n" +
                "recall\n" +
                "receipt\n" +
                "receive\n" +
                "receiver\n" +
                "recent\n" +
                "recently\n" +
                "reception\n" +
                "recite\n" +
                "recognition\n" +
                "recognize\n" +
                "recollect\n" +
                "recommend\n" +
                "recommendation\n" +
                "record\n" +
                "recorder\n" +
                "recover\n" +
                "recovery\n" +
                "red\n" +
                "reduce\n" +
                "reduction\n" +
                "reed\n" +
                "reel\n" +
                "refer\n" +
                "refer oneself to\n" +
                "refer to sb. as\n" +
                "reference\n" +
                "refine\n" +
                "reflect\n" +
                "reflection\n" +
                "reflexion\n" +
                "reform\n" +
                "refresh\n" +
                "refreshment\n" +
                "refrigerator\n" +
                "refuge\n" +
                "refusal\n" +
                "refuse\n" +
                "refute\n" +
                "regard\n" +
                "regarding\n" +
                "regardless\n" +
                "regardless of\n" +
                "region\n" +
                "register\n" +
                "regret\n" +
                "regular\n" +
                "regularly\n" +
                "regulate\n" +
                "regulation\n" +
                "rehearsal\n" +
                "reign\n" +
                "rein\n" +
                "reinforce\n" +
                "reject\n" +
                "rejoice\n" +
                "relate\n" +
                "relation\n" +
                "relationship\n" +
                "relative\n" +
                "relatively\n" +
                "relativity\n" +
                "relax\n" +
                "release\n" +
                "relevant\n" +
                "reliability\n" +
                "reliable\n" +
                "reliance\n" +
                "relief\n" +
                "relieve\n" +
                "religion\n" +
                "religious\n" +
                "reluctant\n" +
                "rely\n" +
                "rely on\n" +
                "remain\n" +
                "remains\n" +
                "remark\n" +
                "remark on\n" +
                "remarkable\n" +
                "remedy\n" +
                "remember\n" +
                "remind\n" +
                "remote\n" +
                "removal\n" +
                "remove\n" +
                "render\n" +
                "renew\n" +
                "rent\n" +
                "repair\n" +
                "repeat\n" +
                "repeatedly\n" +
                "repent\n" +
                "repetition\n" +
                "replace\n" +
                "reply\n" +
                "reply for sb.\n" +
                "reply to sb.\n" +
                "report\n" +
                "report on\n" +
                "report oneself\n" +
                "reporter\n" +
                "represent\n" +
                "representative\n" +
                "reproach\n" +
                "reproduce\n" +
                "republic\n" +
                "republican\n" +
                "reputation\n" +
                "request\n" +
                "require\n" +
                "requirement\n" +
                "rescue\n" +
                "research\n" +
                "researcher\n" +
                "resemble\n" +
                "reserve\n" +
                "reservoir\n" +
                "residence\n" +
                "resident\n" +
                "resign\n" +
                "resignation\n" +
                "resist\n" +
                "resistance\n" +
                "resistant\n" +
                "resolution\n" +
                "resolve\n" +
                "resort\n" +
                "resource\n" +
                "respect\n" +
                "respectful\n" +
                "respective\n" +
                "respectively\n" +
                "respond\n" +
                "response\n" +
                "responsibility\n" +
                "responsible\n" +
                "rest\n" +
                "rest on\n" +
                "restaurant\n" +
                "restless\n" +
                "restore\n" +
                "restrain\n" +
                "restraint\n" +
                "restrict\n" +
                "restriction\n" +
                "result\n" +
                "result from\n" +
                "result in\n" +
                "resume\n" +
                "retain\n" +
                "retell\n" +
                "retire\n" +
                "retreat\n" +
                "return\n" +
                "reveal\n" +
                "revenge\n" +
                "reverse\n" +
                "review\n" +
                "revise\n" +
                "revolt\n" +
                "revolution\n" +
                "revolutionary\n" +
                "revolve around\n" +
                "reward\n" +
                "rhythm\n" +
                "rib\n" +
                "ribbon\n" +
                "rice\n" +
                "rich\n" +
                "rid\n" +
                "riddle\n" +
                "ride\n" +
                "ride down\n" +
                "ride off\n" +
                "ride on\n" +
                "ride over\n" +
                "rider\n" +
                "ridge\n" +
                "ridiculous\n" +
                "rifle\n" +
                "right\n" +
                "right away\n" +
                "rigid\n" +
                "ring\n" +
                "ring off\n" +
                "ring out\n" +
                "ring up\n" +
                "ripe\n" +
                "ripen\n" +
                "rise\n" +
                "rise superior to\n" +
                "risk\n" +
                "rival\n" +
                "river\n" +
                "road\n" +
                "roar\n" +
                "roast\n" +
                "rob\n" +
                "robber\n" +
                "robbery\n" +
                "robe\n" +
                "robot\n" +
                "rock\n" +
                "rocket\n" +
                "rod\n" +
                "role\n" +
                "roll\n" +
                "roll around\n" +
                "roll back\n" +
                "roll in\n" +
                "roll into\n" +
                "roll out\n" +
                "roll up\n" +
                "roller\n" +
                "Roman\n" +
                "romantic\n" +
                "roof\n" +
                "room\n" +
                "root\n" +
                "rope\n" +
                "rose\n" +
                "rot\n" +
                "rotary\n" +
                "rotate\n" +
                "rotation\n" +
                "rotten\n" +
                "rough\n" +
                "roughly\n" +
                "round\n" +
                "round and round\n" +
                "round off\n" +
                "round up\n" +
                "rouse\n" +
                "route\n" +
                "routine\n" +
                "row\n" +
                "royal\n" +
                "rub\n" +
                "rub away\n" +
                "rub down\n" +
                "rub off\n" +
                "rub out\n" +
                "rubber\n" +
                "rubbish\n" +
                "rude\n" +
                "rug\n" +
                "ruin\n" +
                "rule\n" +
                "ruler\n" +
                "rumour\n" +
                "run\n" +
                "run away with\n" +
                "run down\n" +
                "run into\n" +
                "run off\n" +
                "run one's eyes over\n" +
                "run out\n" +
                "run out from\n" +
                "run out of\n" +
                "run over\n" +
                "run through\n" +
                "run up against\n" +
                "run upon\n" +
                "runner\n" +
                "rural\n" +
                "rush\n" +
                "rush into\n" +
                "rush out\n" +
                "rush through\n" +
                "Russian\n" +
                "rust\n" +
                "rusty\n" +
                "sack\n" +
                "sacred\n" +
                "sacrifice\n" +
                "sad\n" +
                "saddle\n" +
                "sadly\n" +
                "sadness\n" +
                "safe\n" +
                "safely\n" +
                "safety\n" +
                "sail\n" +
                "sailor\n" +
                "saint\n" +
                "sake\n" +
                "salad\n" +
                "salary\n" +
                "sale\n" +
                "salesman\n" +
                "salt\n" +
                "salute\n" +
                "same\n" +
                "sample\n" +
                "sand\n" +
                "sandwich\n" +
                "sandy\n" +
                "satellite\n" +
                "satisfaction\n" +
                "satisfactory\n" +
                "satisfy\n" +
                "Saturday\n" +
                "sauce\n" +
                "saucer\n" +
                "sausage\n" +
                "save\n" +
                "save for\n" +
                "save on\n" +
                "save up\n" +
                "saving\n" +
                "saw\n" +
                "say\n" +
                "say yes\n" +
                "scale\n" +
                "scan\n" +
                "scar\n" +
                "scarce\n" +
                "scarcely\n" +
                "scare\n" +
                "scarf\n" +
                "scatter\n" +
                "scene\n" +
                "scenery\n" +
                "scent\n" +
                "schedule\n" +
                "scheme\n" +
                "scholar\n" +
                "scholarship\n" +
                "school\n" +
                "science\n" +
                "scientific\n" +
                "scientist\n" +
                "scissors\n" +
                "scold\n" +
                "scope\n" +
                "score\n" +
                "scorn\n" +
                "scout\n" +
                "scrape\n" +
                "scrape through\n" +
                "scratch\n" +
                "scream\n" +
                "screen\n" +
                "screw\n" +
                "sea\n" +
                "seal\n" +
                "seaman\n" +
                "seaport\n" +
                "search\n" +
                "search after\n" +
                "search out\n" +
                "season\n" +
                "seat\n" +
                "second\n" +
                "secondary\n" +
                "secondly\n" +
                "secret\n" +
                "secretary\n" +
                "section\n" +
                "secure\n" +
                "security\n" +
                "see\n" +
                "see about\n" +
                "see eye to eye\n" +
                "see for oneself\n" +
                "see sb. off\n" +
                "see sb. through\n" +
                "see that\n" +
                "see to\n" +
                "see with\n" +
                "seed\n" +
                "seeing that\n" +
                "seek\n" +
                "seek out\n" +
                "seem\n" +
                "seize\n" +
                "seize hold of\n" +
                "seldom\n" +
                "select\n" +
                "selection\n" +
                "self\n" +
                "selfish\n" +
                "sell\n" +
                "sell off\n" +
                "sell out\n" +
                "sell up\n" +
                "seller\n" +
                "semester\n" +
                "semiconductor\n" +
                "senate\n" +
                "send\n" +
                "send away for\n" +
                "send for\n" +
                "send in\n" +
                "send off\n" +
                "send out\n" +
                "send round\n" +
                "send up\n" +
                "senior\n" +
                "sense\n" +
                "sensible\n" +
                "sensitive\n" +
                "sentence\n" +
                "separate\n" +
                "separately\n" +
                "separation\n" +
                "September\n" +
                "sequence\n" +
                "series\n" +
                "serious\n" +
                "seriously\n" +
                "servant\n" +
                "serve\n" +
                "serve as\n" +
                "service\n" +
                "session\n" +
                "set\n" +
                "set about\n" +
                "set apart\n" +
                "set aside\n" +
                "set back\n" +
                "set down\n" +
                "set fire to\n" +
                "set forth\n" +
                "set free\n" +
                "set light by\n" +
                "set off\n" +
                "set oneself against\n" +
                "set oneself up as\n" +
                "set out\n" +
                "set up\n" +
                "setting\n" +
                "settle\n" +
                "settle down\n" +
                "settle for\n" +
                "settle one's account\n" +
                "settlement\n" +
                "seven\n" +
                "seventeen\n" +
                "seventh\n" +
                "seventy\n" +
                "several\n" +
                "severe\n" +
                "severely\n" +
                "sew\n" +
                "sex\n" +
                "shade\n" +
                "shadow\n" +
                "shady\n" +
                "shake\n" +
                "shake hands with\n" +
                "shake off\n" +
                "shake up\n" +
                "shall\n" +
                "shallow\n" +
                "shame\n" +
                "shampoo\n" +
                "shape\n" +
                "share\n" +
                "sharp\n" +
                "sharpen\n" +
                "sharply\n" +
                "shave\n" +
                "she\n" +
                "shear\n" +
                "shed\n" +
                "sheep\n" +
                "sheet\n" +
                "shelf\n" +
                "shell\n" +
                "shelter\n" +
                "shepherd\n" +
                "shield\n" +
                "shift\n" +
                "shilling\n" +
                "shine\n" +
                "ship\n" +
                "shirt\n" +
                "shiver\n" +
                "shock\n" +
                "shoe\n" +
                "shoot\n" +
                "shoot at\n" +
                "shoot away\n" +
                "shoot out\n" +
                "shoot up\n" +
                "shop\n" +
                "shopkeeper\n" +
                "shopping\n" +
                "shore\n" +
                "short\n" +
                "shortage\n" +
                "shortcoming\n" +
                "shortly\n" +
                "shot\n" +
                "should\n" +
                "shoulder\n" +
                "shout\n" +
                "show\n" +
                "show in\n" +
                "show off\n" +
                "show up\n" +
                "shower\n" +
                "shriek\n" +
                "shrink\n" +
                "shrug off\n" +
                "shut\n" +
                "shut out\n" +
                "shy\n" +
                "sick\n" +
                "sickness\n" +
                "side\n" +
                "side by side\n" +
                "side walk\n" +
                "sideways\n" +
                "sigh\n" +
                "sight\n" +
                "sightseeing\n" +
                "sign\n" +
                "sign in\n" +
                "sign on\n" +
                "signal\n" +
                "signature\n" +
                "significance\n" +
                "significant\n" +
                "silence\n" +
                "silent\n" +
                "silk\n" +
                "silly\n" +
                "silver\n" +
                "similar\n" +
                "similarly\n" +
                "simple\n" +
                "simplicity\n" +
                "simplify\n" +
                "simply\n" +
                "sin\n" +
                "since\n" +
                "sincere\n" +
                "sing\n" +
                "singer\n" +
                "single\n" +
                "single out\n" +
                "singular\n" +
                "sink\n" +
                "sir\n" +
                "sister\n" +
                "sit\n" +
                "sit on\n" +
                "sit up\n" +
                "site\n" +
                "situation\n" +
                "six\n" +
                "sixteen\n" +
                "sixth\n" +
                "sixty\n" +
                "size\n" +
                "size up\n" +
                "skate\n" +
                "sketch\n" +
                "sketch out\n" +
                "ski\n" +
                "skill\n" +
                "skilled\n" +
                "skillful\n" +
                "skim\n" +
                "skim over\n" +
                "skin\n" +
                "skirt\n" +
                "sky\n" +
                "slam\n" +
                "slave\n" +
                "slavery\n" +
                "sleep\n" +
                "sleepy\n" +
                "sleeve\n" +
                "slender\n" +
                "slice\n" +
                "slide\n" +
                "slide into\n" +
                "slide over\n" +
                "slight\n" +
                "slightly\n" +
                "slip\n" +
                "slipper\n" +
                "slippery\n" +
                "slit\n" +
                "slogan\n" +
                "slope\n" +
                "slow\n" +
                "slow down\n" +
                "slowly\n" +
                "slum\n" +
                "sly\n" +
                "small\n" +
                "smart\n" +
                "smell\n" +
                "smell about\n" +
                "smell of\n" +
                "smell out\n" +
                "smile\n" +
                "smile on\n" +
                "smog\n" +
                "smoke\n" +
                "smooth\n" +
                "smooth out\n" +
                "smoothly\n" +
                "snake\n" +
                "snow\n" +
                "snowstorm\n" +
                "snowy\n" +
                "so\n" +
                "so far\n" +
                "so long as\n" +
                "so much as that\n" +
                "so that\n" +
                "so to speak\n" +
                "so-called\n" +
                "so...as to\n" +
                "so...that\n" +
                "soak\n" +
                "soap\n" +
                "sob\n" +
                "sober\n" +
                "soccer\n" +
                "social\n" +
                "socialism\n" +
                "socialist\n" +
                "society\n" +
                "sock\n" +
                "soda\n" +
                "soft\n" +
                "softly\n" +
                "soil\n" +
                "solar\n" +
                "soldier\n" +
                "sole\n" +
                "solely\n" +
                "solemn\n" +
                "solid\n" +
                "soluble\n" +
                "solution\n" +
                "solve\n" +
                "some\n" +
                "somebody\n" +
                "somehow\n" +
                "someone\n" +
                "something\n" +
                "something else\n" +
                "something like\n" +
                "something of\n" +
                "sometime\n" +
                "sometimes\n" +
                "somewhat\n" +
                "somewhere\n" +
                "son\n" +
                "song\n" +
                "soon\n" +
                "sooner or later\n" +
                "sophisticated\n" +
                "sore\n" +
                "sorrow\n" +
                "sorry\n" +
                "sort\n" +
                "soul\n" +
                "sound\n" +
                "soup\n" +
                "sour\n" +
                "source\n" +
                "south\n" +
                "southeast\n" +
                "southern\n" +
                "southwest\n" +
                "Soviet\n" +
                "sow\n" +
                "space\n" +
                "spacecraft\n" +
                "spaceship\n" +
                "spade\n" +
                "span\n" +
                "Spanish\n" +
                "spare\n" +
                "spark\n" +
                "sparkle\n" +
                "sparrow\n" +
                "speak\n" +
                "speak for\n" +
                "speak up\n" +
                "speak volume for\n" +
                "speak well for\n" +
                "speaker\n" +
                "spear\n" +
                "special\n" +
                "specialist\n" +
                "speciality\n" +
                "specialize\n" +
                "specially\n" +
                "specific\n" +
                "specify\n" +
                "specimen\n" +
                "spectacle\n" +
                "speech\n" +
                "speed\n" +
                "speed up\n" +
                "spell\n" +
                "spelling\n" +
                "spend\n" +
                "sphere\n" +
                "spider\n" +
                "spill\n" +
                "spin\n" +
                "spirit\n" +
                "spiritual\n" +
                "spit\n" +
                "splash\n" +
                "splendid\n" +
                "split\n" +
                "spoil\n" +
                "sponge\n" +
                "sponsor\n" +
                "spontaneous\n" +
                "spoon\n" +
                "sport\n" +
                "sportsman\n" +
                "spot\n" +
                "spray\n" +
                "spread\n" +
                "spread out\n" +
                "spring\n" +
                "spring up\n" +
                "springtime\n" +
                "sprinkle\n" +
                "spur\n" +
                "spy\n" +
                "square\n" +
                "squeeze\n" +
                "squirrel\n" +
                "stab\n" +
                "stability\n" +
                "stable\n" +
                "stack\n" +
                "stadium\n" +
                "staff\n" +
                "stage\n" +
                "stain\n" +
                "stair\n" +
                "staircase\n" +
                "stake\n" +
                "stale\n" +
                "stamp\n" +
                "stand\n" +
                "stand a chance\n" +
                "stand by\n" +
                "stand for\n" +
                "stand in one's way\n" +
                "stand out\n" +
                "stand the test\n" +
                "stand up\n" +
                "stand up for\n" +
                "stand up to\n" +
                "standard\n" +
                "standpoint\n" +
                "star\n" +
                "stare\n" +
                "start\n" +
                "start off\n" +
                "start up\n" +
                "startle\n" +
                "starve\n" +
                "state\n" +
                "statement\n" +
                "statesman\n" +
                "static\n" +
                "station\n" +
                "statistical\n" +
                "statue\n" +
                "status\n" +
                "stay\n" +
                "stay up\n" +
                "steadily\n" +
                "steady\n" +
                "steal\n" +
                "steam\n" +
                "steamer\n" +
                "steel\n" +
                "steep\n" +
                "steer\n" +
                "stem\n" +
                "step\n" +
                "step by step\n" +
                "step up\n" +
                "stern\n" +
                "steward\n" +
                "stewardess\n" +
                "stick\n" +
                "stick out\n" +
                "stick to\n" +
                "sticky\n" +
                "stiff\n" +
                "stiffen\n" +
                "still\n" +
                "stimulate\n" +
                "sting\n" +
                "stir\n" +
                "stitch\n" +
                "stock\n" +
                "stocking\n" +
                "stomach\n" +
                "stone\n" +
                "stony\n" +
                "stool\n" +
                "stoop\n" +
                "stop\n" +
                "stop by\n" +
                "stop off\n" +
                "storage\n" +
                "store\n" +
                "store up\n" +
                "storey\n" +
                "storm\n" +
                "stormy\n" +
                "story\n" +
                "stove\n" +
                "straight\n" +
                "strain\n" +
                "strange\n" +
                "stranger\n" +
                "strap\n" +
                "strategy\n" +
                "straw\n" +
                "strawberry\n" +
                "stray away from\n" +
                "stream\n" +
                "street\n" +
                "strength\n" +
                "strengthen\n" +
                "stress\n" +
                "stretch\n" +
                "stretch out\n" +
                "strict\n" +
                "strictly\n" +
                "strike\n" +
                "string\n" +
                "string up\n" +
                "strip\n" +
                "stripe\n" +
                "stroke\n" +
                "strong\n" +
                "strongly\n" +
                "structural\n" +
                "structure\n" +
                "struggle\n" +
                "struggle against\n" +
                "struggle for\n" +
                "student\n" +
                "study\n" +
                "stuff\n" +
                "stuff up\n" +
                "stuff with\n" +
                "stumble\n" +
                "stupid\n" +
                "style\n" +
                "subject\n" +
                "subject to\n" +
                "submarine\n" +
                "submerge\n" +
                "submit\n" +
                "subsequent\n" +
                "substance\n" +
                "substantial\n" +
                "substitute\n" +
                "subtract\n" +
                "suburb\n" +
                "subway\n" +
                "succeed\n" +
                "succeed in\n" +
                "success\n" +
                "successful\n" +
                "successfully\n" +
                "succession\n" +
                "successive\n" +
                "such\n" +
                "such as\n" +
                "suck\n" +
                "sudden\n" +
                "suddenly\n" +
                "suffer\n" +
                "sufficient\n" +
                "sufficiently\n" +
                "sugar\n" +
                "suggest\n" +
                "suggestion\n" +
                "suit\n" +
                "suitable\n" +
                "sulphur\n" +
                "sum\n" +
                "sum up\n" +
                "summarize\n" +
                "summary\n" +
                "summer\n" +
                "sun\n" +
                "Sunday\n" +
                "sunlight\n" +
                "sunny\n" +
                "sunrise\n" +
                "sunset\n" +
                "sunshine\n" +
                "super\n" +
                "superficial\n" +
                "superior\n" +
                "supermarket\n" +
                "supper\n" +
                "supplement\n" +
                "supply\n" +
                "support\n" +
                "suppose\n" +
                "supreme\n" +
                "sure\n" +
                "surely\n" +
                "surface\n" +
                "surgeon\n" +
                "surgery\n" +
                "surname\n" +
                "surprise\n" +
                "surprising\n" +
                "surprisingly\n" +
                "surrender\n" +
                "surround\n" +
                "surroundings\n" +
                "survey\n" +
                "survive\n" +
                "suspect\n" +
                "suspend\n" +
                "suspicion\n" +
                "sustain\n" +
                "swallow\n" +
                "swamp\n" +
                "swan\n" +
                "swarm\n" +
                "sway\n" +
                "swear\n" +
                "sweat\n" +
                "sweater\n" +
                "sweep\n" +
                "sweep clean\n" +
                "sweep off\n" +
                "sweet\n" +
                "swell\n" +
                "swift\n" +
                "swim\n" +
                "swing\n" +
                "Swiss\n" +
                "switch\n" +
                "switch off\n" +
                "switch on\n" +
                "sword\n" +
                "symbol\n" +
                "sympathetic\n" +
                "sympathize\n" +
                "sympathy\n" +
                "synthetic\n" +
                "system\n" +
                "systematic\n" +
                "systematical\n" +
                "table\n" +
                "tablet\n" +
                "tag\n" +
                "tail\n" +
                "tailor\n" +
                "take\n" +
                "take a chance\n" +
                "take a dislike to\n" +
                "take a hand in\n" +
                "take action\n" +
                "take advantage of\n" +
                "take after\n" +
                "take apart\n" +
                "take away\n" +
                "take care\n" +
                "take care of\n" +
                "take charge\n" +
                "take delight in\n" +
                "take down\n" +
                "take effect\n" +
                "take for\n" +
                "take interest in\n" +
                "take into account\n" +
                "take issue with sb.\n" +
                "take it easy\n" +
                "take leave of\n" +
                "take note of\n" +
                "take notes\n" +
                "take notice of\n" +
                "take off\n" +
                "take on\n" +
                "take one's chance\n" +
                "take one's measure\n" +
                "take oneself off\n" +
                "take order to do\n" +
                "take order with\n" +
                "take out\n" +
                "take out loans\n" +
                "take over\n" +
                "take pains\n" +
                "take part in\n" +
                "take part with\n" +
                "take place\n" +
                "take pride in\n" +
                "take sb. to task\n" +
                "take steps\n" +
                "take the lead\n" +
                "take the place of\n" +
                "take the road\n" +
                "take the road of\n" +
                "take thought for\n" +
                "take time\n" +
                "take to\n" +
                "take to one's heels\n" +
                "take turns\n" +
                "take up\n" +
                "take...as\n" +
                "tale\n" +
                "talent\n" +
                "talk\n" +
                "talk back\n" +
                "talk out\n" +
                "talk over\n" +
                "talk up\n" +
                "talk with\n" +
                "tall\n" +
                "tame\n" +
                "tan\n" +
                "tank\n" +
                "tap\n" +
                "tape\n" +
                "target\n" +
                "task\n" +
                "taste\n" +
                "taste of\n" +
                "tax\n" +
                "taxi\n" +
                "tea\n" +
                "teach\n" +
                "teach a lesson\n" +
                "teach school\n" +
                "teacher\n" +
                "teaching\n" +
                "team\n" +
                "tear\n" +
                "tear down\n" +
                "tear off\n" +
                "tear up\n" +
                "technical\n" +
                "technician\n" +
                "technique\n" +
                "technology\n" +
                "tedious\n" +
                "teenager\n" +
                "telegram\n" +
                "telegraph\n" +
                "telephone\n" +
                "telephone to sb.\n" +
                "telescope\n" +
                "television\n" +
                "tell\n" +
                "tell about\n" +
                "tell on\n" +
                "tell...apart\n" +
                "tell...from\n" +
                "temper\n" +
                "temperature\n" +
                "temple\n" +
                "temporary\n" +
                "tempt\n" +
                "temptation\n" +
                "ten\n" +
                "tenant\n" +
                "tend\n" +
                "tendency\n" +
                "tender\n" +
                "tennis\n" +
                "tense\n" +
                "tent\n" +
                "tenth\n" +
                "term\n" +
                "terminal\n" +
                "terrible\n" +
                "terrific\n" +
                "territory\n" +
                "terror\n" +
                "test\n" +
                "text\n" +
                "textbook\n" +
                "textile\n" +
                "than\n" +
                "thank\n" +
                "thanks to\n" +
                "that\n" +
                "that is\n" +
                "that is to say\n" +
                "the\n" +
                "the mass of\n" +
                "the moment that\n" +
                "the other day\n" +
                "the rank and file\n" +
                "the same as\n" +
                "theatre\n" +
                "their\n" +
                "theirs\n" +
                "them\n" +
                "themselves\n" +
                "then\n" +
                "theoretical\n" +
                "theory\n" +
                "there\n" +
                "there and then\n" +
                "thereby\n" +
                "therefore\n" +
                "thermometer\n" +
                "these\n" +
                "they\n" +
                "thick\n" +
                "thickness\n" +
                "thief\n" +
                "thin\n" +
                "thing\n" +
                "think\n" +
                "think better of\n" +
                "think nothing of\n" +
                "think of\n" +
                "think of...as\n" +
                "think out\n" +
                "think over\n" +
                "think through\n" +
                "think twice\n" +
                "think up\n" +
                "third\n" +
                "thirdly\n" +
                "thirst\n" +
                "thirsty\n" +
                "thirteen\n" +
                "thirty\n" +
                "this\n" +
                "thorn\n" +
                "thorough\n" +
                "those\n" +
                "though\n" +
                "thought\n" +
                "thoughtful\n" +
                "thousand\n" +
                "thread\n" +
                "threat\n" +
                "threaten\n" +
                "three\n" +
                "thrill\n" +
                "thrive\n" +
                "throat\n" +
                "throne\n" +
                "throng\n" +
                "through\n" +
                "throughout\n" +
                "throw\n" +
                "throw about\n" +
                "throw away\n" +
                "throw doubt upon\n" +
                "throw light on sth.\n" +
                "throw off\n" +
                "throw over\n" +
                "throw up\n" +
                "thrust\n" +
                "thumb\n" +
                "thunder\n" +
                "Thursday\n" +
                "thus\n" +
                "tick\n" +
                "ticket\n" +
                "tide\n" +
                "tidy\n" +
                "tie\n" +
                "tie up\n" +
                "tiger\n" +
                "tight\n" +
                "till\n" +
                "timber\n" +
                "time\n" +
                "timetable\n" +
                "timid\n" +
                "tin\n" +
                "tiny\n" +
                "tip\n" +
                "tire\n" +
                "tired\n" +
                "tissue\n" +
                "title\n" +
                "to\n" +
                "to a day\n" +
                "to begin with\n" +
                "to date\n" +
                "to say nothing of\n" +
                "to some extent\n" +
                "to speak of\n" +
                "to the contrary\n" +
                "to the end of time\n" +
                "to the full\n" +
                "to the life\n" +
                "to the limit\n" +
                "to the number of\n" +
                "to the point\n" +
                "toast\n" +
                "tobacco\n" +
                "today\n" +
                "toe\n" +
                "together\n" +
                "together with\n" +
                "toilet\n" +
                "tolerance\n" +
                "tolerate\n" +
                "tomato\n" +
                "tomb\n" +
                "tomorrow\n" +
                "ton\n" +
                "tone\n" +
                "tongue\n" +
                "tonight\n" +
                "too\n" +
                "too...to...\n" +
                "tool\n" +
                "tooth\n" +
                "top\n" +
                "topic\n" +
                "torch\n" +
                "torrent\n" +
                "tortoise\n" +
                "torture\n" +
                "toss\n" +
                "total\n" +
                "touch\n" +
                "touch on\n" +
                "touch up\n" +
                "tough\n" +
                "tour\n" +
                "tourist\n" +
                "toward\n" +
                "towards\n" +
                "towel\n" +
                "tower\n" +
                "town\n" +
                "toy\n" +
                "trace\n" +
                "track\n" +
                "track down\n" +
                "track out\n" +
                "tractor\n" +
                "trade\n" +
                "tradition\n" +
                "traditional\n" +
                "traffic\n" +
                "tragedy\n" +
                "trail\n" +
                "trail off\n" +
                "train\n" +
                "training\n" +
                "traitor\n" +
                "tram\n" +
                "tramp\n" +
                "transfer\n" +
                "transform\n" +
                "transformation\n" +
                "transformer\n" +
                "transistor\n" +
                "translate\n" +
                "translation\n" +
                "transmission\n" +
                "transmit\n" +
                "transparent\n" +
                "transport\n" +
                "transportation\n" +
                "trap\n" +
                "travel\n" +
                "tray\n" +
                "treason\n" +
                "treasure\n" +
                "treat\n" +
                "treat sb. as\n" +
                "treat sb. for\n" +
                "treatment\n" +
                "treaty\n" +
                "tree\n" +
                "tremble\n" +
                "tremendous\n" +
                "trend\n" +
                "trial\n" +
                "triangle\n" +
                "tribe\n" +
                "trick\n" +
                "trifle\n" +
                "trim\n" +
                "trip\n" +
                "triumph\n" +
                "troop\n" +
                "tropical\n" +
                "trouble\n" +
                "troublesome\n" +
                "trousers\n" +
                "truck\n" +
                "truly\n" +
                "trumpet\n" +
                "trunk\n" +
                "trust\n" +
                "truth\n" +
                "try\n" +
                "try for\n" +
                "try on\n" +
                "try out\n" +
                "tub\n" +
                "tube\n" +
                "tuck\n" +
                "Tuesday\n" +
                "tuition\n" +
                "tumble\n" +
                "tune\n" +
                "tune in\n" +
                "tune out\n" +
                "tunnel\n" +
                "turbine\n" +
                "turbulent\n" +
                "turkey\n" +
                "turn\n" +
                "turn against\n" +
                "turn away\n" +
                "turn down\n" +
                "turn in\n" +
                "turn into\n" +
                "turn off\n" +
                "turn on\n" +
                "turn one's back on\n" +
                "turn out\n" +
                "turn over\n" +
                "turn sb's blood cold\n" +
                "turn to\n" +
                "turn up\n" +
                "turning\n" +
                "turnip\n" +
                "tutor\n" +
                "twelfth\n" +
                "twelve\n" +
                "twentieth\n" +
                "twenty\n" +
                "twice\n" +
                "twin\n" +
                "twinkle\n" +
                "twist\n" +
                "two\n" +
                "type\n" +
                "typewriter\n" +
                "typhoon\n" +
                "typical\n" +
                "typist\n" +
                "tyre\n" +
                "ugly\n" +
                "ultimate\n" +
                "ultimately\n" +
                "umbrella\n" +
                "unable\n" +
                "unbearable\n" +
                "uncertain\n" +
                "uncle\n" +
                "uncomfortable\n" +
                "unconscious\n" +
                "uncover\n" +
                "under\n" +
                "under arms\n" +
                "under control\n" +
                "under the charge of\n" +
                "under the heel of\n" +
                "under way\n" +
                "undergo\n" +
                "undergraduate\n" +
                "underground\n" +
                "underline\n" +
                "underneath\n" +
                "understand\n" +
                "understanding\n" +
                "undertake\n" +
                "undertaking\n" +
                "undo\n" +
                "undoubtedly\n" +
                "uneasy\n" +
                "unexpected\n" +
                "unfair\n" +
                "unfortunate\n" +
                "unfortunately\n" +
                "unhappy\n" +
                "uniform\n" +
                "union\n" +
                "unique\n" +
                "unit\n" +
                "unite\n" +
                "unity\n" +
                "universal\n" +
                "universe\n" +
                "university\n" +
                "unjust\n" +
                "unkind\n" +
                "unknown\n" +
                "unless\n" +
                "unlike\n" +
                "unlikely\n" +
                "unload\n" +
                "unlucky\n" +
                "unnecessary\n" +
                "unpleasant\n" +
                "unsatisfactory\n" +
                "unstable\n" +
                "unsuitable\n" +
                "until\n" +
                "unusual\n" +
                "unusually\n" +
                "unwilling\n" +
                "up\n" +
                "up and doing\n" +
                "up in arms\n" +
                "up to\n" +
                "up to date\n" +
                "up to time\n" +
                "up-to-date\n" +
                "upon\n" +
                "upper\n" +
                "upright\n" +
                "upset\n" +
                "upside-down\n" +
                "upstairs\n" +
                "upward\n" +
                "upwards\n" +
                "urge\n" +
                "urgent\n" +
                "us\n" +
                "usage\n" +
                "use\n" +
                "use up\n" +
                "used\n" +
                "used to\n" +
                "useful\n" +
                "useless\n" +
                "user\n" +
                "usual\n" +
                "usually\n" +
                "utility\n" +
                "utilize\n" +
                "utmost\n" +
                "utter\n" +
                "vacant\n" +
                "vacation\n" +
                "vacuum\n" +
                "vague\n" +
                "vain\n" +
                "valid\n" +
                "valley\n" +
                "valuable\n" +
                "value\n" +
                "value oneself on\n" +
                "van\n" +
                "vanish\n" +
                "vanity\n" +
                "vapour\n" +
                "variable\n" +
                "variation\n" +
                "variety\n" +
                "various\n" +
                "vary\n" +
                "vase\n" +
                "vast\n" +
                "vegetable\n" +
                "vehicle\n" +
                "veil\n" +
                "velocity\n" +
                "velvet\n" +
                "venture\n" +
                "verb\n" +
                "verify\n" +
                "version\n" +
                "vertical\n" +
                "very\n" +
                "vessel\n" +
                "vest\n" +
                "veteran\n" +
                "vex\n" +
                "via\n" +
                "vibrate\n" +
                "vibration\n" +
                "vice\n" +
                "victim\n" +
                "victorious\n" +
                "victory\n" +
                "video\n" +
                "view\n" +
                "viewpoint\n" +
                "vigorous\n" +
                "village\n" +
                "vine\n" +
                "vinegar\n" +
                "violence\n" +
                "violent\n" +
                "violet\n" +
                "violin\n" +
                "virtually\n" +
                "virtue\n" +
                "visible\n" +
                "vision\n" +
                "visit\n" +
                "visitor\n" +
                "visual\n" +
                "vital\n" +
                "vitamin\n" +
                "vivid\n" +
                "vocabulary\n" +
                "voice\n" +
                "volcano\n" +
                "volleyball\n" +
                "volt\n" +
                "voltage\n" +
                "volume\n" +
                "voluntary\n" +
                "vote\n" +
                "vote down\n" +
                "vote in\n" +
                "vote through\n" +
                "voyage\n" +
                "wage\n" +
                "waggon\n" +
                "waist\n" +
                "wait\n" +
                "wait at table\n" +
                "wait for\n" +
                "wait on\n" +
                "waiter\n" +
                "wake\n" +
                "wake up\n" +
                "waken\n" +
                "walk\n" +
                "walk off\n" +
                "walk out\n" +
                "wall\n" +
                "wallet\n" +
                "wander\n" +
                "wander about\n" +
                "want\n" +
                "war\n" +
                "warm\n" +
                "warm up\n" +
                "warmth\n" +
                "warn\n" +
                "wash\n" +
                "wash up\n" +
                "waste\n" +
                "watch\n" +
                "watch out for\n" +
                "water\n" +
                "waterfall\n" +
                "waterproof\n" +
                "wave\n" +
                "wavelength\n" +
                "wax\n" +
                "way\n" +
                "we\n" +
                "weak\n" +
                "weaken\n" +
                "weakness\n" +
                "wealth\n" +
                "wealthy\n" +
                "weapon\n" +
                "wear\n" +
                "wear off\n" +
                "wear out\n" +
                "weary\n" +
                "weather\n" +
                "weave\n" +
                "wedding\n" +
                "Wednesday\n" +
                "weed\n" +
                "weed out\n" +
                "week\n" +
                "weekday\n" +
                "weekend\n" +
                "weekly\n" +
                "weep\n" +
                "weep away\n" +
                "weep out\n" +
                "weigh\n" +
                "weight\n" +
                "welcome\n" +
                "weld\n" +
                "welfare\n" +
                "well\n" +
                "well-known\n" +
                "west\n" +
                "western\n" +
                "westward\n" +
                "wet\n" +
                "what\n" +
                "What about...?\n" +
                "What if...?\n" +
                "what is more\n" +
                "whatever\n" +
                "wheat\n" +
                "wheel\n" +
                "when\n" +
                "whenever\n" +
                "where\n" +
                "wherever\n" +
                "whether\n" +
                "whether...or\n" +
                "which\n" +
                "whichever\n" +
                "while\n" +
                "whilst\n" +
                "whip\n" +
                "whirl\n" +
                "whisky\n" +
                "whisper\n" +
                "whistle\n" +
                "white\n" +
                "whitewash\n" +
                "who\n" +
                "whoever\n" +
                "whole\n" +
                "wholly\n" +
                "whom\n" +
                "whose\n" +
                "why\n" +
                "wicked\n" +
                "wide\n" +
                "widely\n" +
                "widen\n" +
                "widespread\n" +
                "widow\n" +
                "width\n" +
                "wife\n" +
                "wild\n" +
                "will\n" +
                "willing\n" +
                "win\n" +
                "wind\n" +
                "wind up\n" +
                "window\n" +
                "wine\n" +
                "wing\n" +
                "winner\n" +
                "winter\n" +
                "wipe\n" +
                "wipe out\n" +
                "wire\n" +
                "wireless\n" +
                "wisdom\n" +
                "wise\n" +
                "wish\n" +
                "wish for\n" +
                "wit\n" +
                "with\n" +
                "with one voice\n" +
                "with regard to\n" +
                "with respect to\n" +
                "with the help of\n" +
                "with the view of\n" +
                "with young\n" +
                "withdraw\n" +
                "within\n" +
                "within limits\n" +
                "without\n" +
                "without day\n" +
                "without doubt\n" +
                "without fail\n" +
                "without limits\n" +
                "without number\n" +
                "without question\n" +
                "without regard to\n" +
                "without so much as\n" +
                "withstand\n" +
                "witness\n" +
                "wolf\n" +
                "woman\n" +
                "wonder\n" +
                "wonderful\n" +
                "wood\n" +
                "wooden\n" +
                "wool\n" +
                "woollen\n" +
                "word\n" +
                "word for word\n" +
                "work\n" +
                "work at\n" +
                "work off\n" +
                "work out\n" +
                "work up\n" +
                "worker\n" +
                "workman\n" +
                "workshop\n" +
                "world\n" +
                "world without end\n" +
                "world-wide\n" +
                "worm\n" +
                "worry\n" +
                "worse\n" +
                "worship\n" +
                "worst\n" +
                "worth\n" +
                "worthless\n" +
                "worthwhile\n" +
                "worthy\n" +
                "would\n" +
                "would rather do\n" +
                "would rather...than\n" +
                "wound\n" +
                "wrap\n" +
                "wrap up\n" +
                "wreath\n" +
                "wreck\n" +
                "wrist\n" +
                "write\n" +
                "write down\n" +
                "write off\n" +
                "write out\n" +
                "write up\n" +
                "writer\n" +
                "writing\n" +
                "wrong\n" +
                "X-ray\n" +
                "yard\n" +
                "yawn\n" +
                "year\n" +
                "year after year\n" +
                "year in year out\n" +
                "yearly\n" +
                "yell\n" +
                "yellow\n" +
                "yes\n" +
                "yesterday\n" +
                "yet\n" +
                "yield\n" +
                "you\n" +
                "young\n" +
                "young and old\n" +
                "your\n" +
                "yours\n" +
                "yourself\n" +
                "youth\n" +
                "youthful\n" +
                "zeal\n" +
                "zealous\n" +
                "zebra\n" +
                "zero\n" +
                "zone\n" +
                "zoo";

        for (String s4 : s3.split("\\n")) {
            System.out.println(s4);
        }

        String s4 = "hello,world!";
        System.out.println(s4.substring(4));

        System.out.println(s4.toUpperCase().toLowerCase());

        System.out.println(upper("HELLo"));

        String s5 = "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/07/02/giant-rocket.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/C8SW.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/07/01/nasa-x-planes.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/Q7Q2.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/06/20/dent-in-rings.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/6IBY.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/06/16/small-asteroid.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/6OBB.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/06/11/trans-women-prisoner.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/Q2DL.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/06/02/nasa-beam-module.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/7955.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/05/17/latest-discoveries.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/5EI6.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/05/02/mystery-lines.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/TC09.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/04/28/spacex-red-dragon.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/LNOY.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/04/27/sail-deep-space.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/RG2P.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/04/26/hubbles-greatest.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/3OUG.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/04/25/soyuz-capsule-landing.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/2JCW.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/04/21/temperatures-ocean.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/LZFK.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/04/16/space-habitat.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"http://tankr.net/s/custom/4N1E.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/04/08/beam-iss.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/HYM6.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/03/19/large-fire.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/PAD6.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/03/06/astronaut-scott-kelly.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/Z0ZS.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/03/05/welcomed-nasa-astronaut.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/LS52.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/03/03/nasa-invited-india.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/D1EY.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/02/23/music-at-moon.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/IOF8.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/02/17/alien-hunters.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/G7IF.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/02/13/space-tourism-posters.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/Q5GB.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/02/07/keeping-in-cabin.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/50X9.jpg\" width=\"175\" height=\"98\" /></a></div>\n" +
                "<div class=\"thumbs_b\"><a href=\"http://jandan.net/2016/01/30/deep-space-habitat.html\" target=\"_blank\"><img class=\"lazy\" data-original=\"//tankr.net/s/custom/DM5N.jpg\" width=\"175\" height=\"98\" /></a></div>";

        for (String s6 : s5.split("\\n")) {
            System.out.println(s6.substring(s6.indexOf("tankr"), s6.indexOf("jpg") + 3));
        }
    }

    public static String lower(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c > 'A' && c < 'Z') {
                chars[i] = (char) (c + 32);
            }
        }
        return new String(chars);
    }

    public static String upper(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c > 'a' && c < 'z') {
                chars[i] = (char) (c - 32);  // A - 65; a - 97
            }
        }
        return new String(chars);
    }
}
