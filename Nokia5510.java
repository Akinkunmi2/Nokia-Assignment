import java.util.Scanner;

public class Nokia5510 {

    static Scanner scanner = new Scanner(System.in);

    static void mainMenu() {
        while (true) {
            System.out.println("""

========== MAIN MENU ==========
1.  Phone book
2.  Messages
3.  Chat
4.  Call register
5.  Tones
6.  Settings
7.  Call divert
8.  Music
9.  Games
10. Calculator
11. Reminders
12. Clock
13. Profiles
14. Services
15. SIM Services
0.  Exit
""");
            System.out.print("Choose from the main menu (0-15): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    phoneBook();
                    break;
                case 2:
                    messages();
                    break;
                case 3:
                    chat();
                    break;
                case 4:
                    callRegister();
                    break;
                case 5:
                    tones();
                    break;
                case 6:
                    settings();
                    break;
                case 7:
                    callDivert();
                    break;
                case 8:
                    music();
                    break;
                case 9:
                    games();
                    break;
                case 10:
                    calculator();
                    break;
                case 11:
                    reminders();
                    break;
                case 12:
                    clock();
                    break;
                case 13:
                    profiles();
                    break;
                case 14:
                    services();
                    break;
                case 15:
                    simServices();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }

    static void phoneBook() {
        while (true) {
            System.out.println("""

1.Search
2.Service Nos
3.Add name
4.Erase
5.Edit
6.Copy
7.Assign tone
8.Send b'card
9.Options
10.Speed dials
11.Voice tags
0.Back
""");
            System.out.print("Choose menu (0-11): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Search...");
                    break;
                case 2:
                    System.out.println("Service Nos...");
                    break;
                case 3:
                    System.out.println("Add name...");
                    break;
                case 4:
                    System.out.println("Erase...");
                    break;
                case 5:
                    System.out.println("Edit...");
                    break;
                case 6:
                    System.out.println("Copy...");
                    break;
                case 7:
                    System.out.println("Assign tone...");
                    break;
                case 8:
                    System.out.println("Send b'card...");
                    break;
                case 9:
                    options();
                    break;
                case 10:
                    System.out.println("Speed dials...");
                    break;
                case 11:
                    System.out.println("Voice tags...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void options() {
        while (true) {
            System.out.println("""

1.Memory in use
2.Type of view
3.Memory status
0.Back
""");
            System.out.print("Enter any of the options (0-3): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Memory in use...");
                    break;
                case 2:
                    System.out.println("Type of view...");
                    break;
                case 3:
                    System.out.println("Memory status...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void messages() {
        while (true) {
            System.out.println("""

1.Write messages
2.Inbox
3.Outbox
4.Picture messages
5.Templates
6.Smileys
7.Messages settings
8.Info service
9.Voice mailbox number
10.Service command editor
0.Back
""");
            System.out.print("Choose any of the options (0-10): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Write messages...");
                    break;
                case 2:
                    System.out.println("Inbox...");
                    break;
                case 3:
                    System.out.println("Outbox...");
                    break;
                case 4:
                    System.out.println("Picture messages...");
                    break;
                case 5:
                    System.out.println("Templates...");
                    break;
                case 6:
                    System.out.println("Smileys...");
                    break;
                case 7:
                    messageSettings();
                    break;
                case 8:
                    System.out.println("Info service...");
                    break;
                case 9:
                    System.out.println("Voice mailbox number...");
                    break;
                case 10:
                    System.out.println("Service command editor...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void messageSettings() {
        while (true) {
            System.out.println("""

1.Set
2.Common
0.Back
""");
            System.out.print("Choose any of the options (0-2): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    messageSettingsSet();
                    break;
                case 2:
                    messageSettingsCommon();
                    break;
                case 0:
                    return;
            }
        }
    }

    static void messageSettingsSet() {
        while (true) {
            System.out.println("""

1.Messages centre number
2.Messages sent as
3.Messages validity
0.Back
""");
            System.out.print("Choose any option (0-3): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Messages centre number...");
                    break;
                case 2:
                    System.out.println("Messages sent as...");
                    break;
                case 3:
                    System.out.println("Messages validity...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void messageSettingsCommon() {
        while (true) {
            System.out.println("""

1.Delivery reports
2.Reply via the same centre
3.Character support
0.Back
""");
            System.out.print("Choose menu (0-3): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Delivery reports...");
                    break;
                case 2:
                    System.out.println("Reply via the same centre...");
                    break;
                case 3:
                    System.out.println("Character support...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void callRegister() {
        while (true) {
            System.out.println("""

1.Missed calls
2.Received calls
3.Dialed numbers
4.Erase recent call lists
5.Show call duration
6.Show call costs
7.Call cost settings
8.Prepaid credit
0.Back
""");
            System.out.print("Choose any of the options (0-8): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Missed calls...");
                    break;
                case 2:
                    System.out.println("Received calls...");
                    break;
                case 3:
                    System.out.println("Dialed numbers...");
                    break;
                case 4:
                    System.out.println("Erase recent call lists...");
                    break;
                case 5:
                    callDuration();
                    break;
                case 6:
                    callCosts();
                    break;
                case 7:
                    callCostSettings();
                    break;
                case 8:
                    System.out.println("Prepaid credit...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void callDuration() {
        while (true) {
            System.out.println("""

1.Last call duration
2.All call duration
3.Received calls duration
4.Dialed calls duration
5.Clear timers
0.Back
""");
            System.out.print("Choose menu (0-5): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Last call duration...");
                    break;
                case 2:
                    System.out.println("All call duration...");
                    break;
                case 3:
                    System.out.println("Received calls duration...");
                    break;
                case 4:
                    System.out.println("Dialed calls duration...");
                    break;
                case 5:
                    System.out.println("Clear timers...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void callCosts() {
        while (true) {
            System.out.println("""

1.Last call cost
2.All call cost
3.Clear counters
0.Back
""");
            System.out.print("Choose menu (0-3): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Last call cost...");
                    break;
                case 2:
                    System.out.println("All call cost...");
                    break;
                case 3:
                    System.out.println("Clear counters...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void callCostSettings() {
        while (true) {
            System.out.println("""

1.Call cost limit
2.Show cost in
0.Back
""");
            System.out.print("Choose menu (0-2): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Call cost limit...");
                    break;
                case 2:
                    System.out.println("Show cost in...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void tones() {
        while (true) {
            System.out.println("""

1.Ringing tone
2.Ringing volume
3.Incoming call alert
4.Messages alert tone
5.Keypad tones
6.Warning tones
7.Vibrating alert
8.Screen saver
0.Back
""");
            System.out.print("Choose menu (0-8): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ringing tone...");
                    break;
                case 2:
                    System.out.println("Ringing volume...");
                    break;
                case 3:
                    System.out.println("Incoming call alert...");
                    break;
                case 4:
                    System.out.println("Messages alert tone...");
                    break;
                case 5:
                    System.out.println("Keypad tones...");
                    break;
                case 6:
                    System.out.println("Warning tones...");
                    break;
                case 7:
                    System.out.println("Vibrating alert...");
                    break;
                case 8:
                    System.out.println("Screen saver...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void settings() {
        while (true) {
            System.out.println("""

1.Call settings
2.Phone settings
3.Security settings
4.Restore factory settings
0.Back
""");
            System.out.print("Choose any of the options (0-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    callSettings();
                    break;
                case 2:
                    phoneSettings();
                    break;
                case 3:
                    securitySettings();
                    break;
                case 4:
                    System.out.println("Restore factory settings...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void callSettings() {
        while (true) {
            System.out.println("""

1.Automatic redial
2.Speed redial
3.Call waiting options
4.Own number settings
5.Phone number in use
6.Automatic answer
0.Back
""");
            System.out.print("Choose menu (0-6): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Automatic redial...");
                    break;
                case 2:
                    System.out.println("Speed redial...");
                    break;
                case 3:
                    System.out.println("Call waiting options...");
                    break;
                case 4:
                    System.out.println("Own number settings...");
                    break;
                case 5:
                    System.out.println("Phone number in use...");
                    break;
                case 6:
                    System.out.println("Automatic answer...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void phoneSettings() {
        while (true) {
            System.out.println("""

1.Language
2.Cell info display
3.Welcome note
4.Network selection
5.Confirm SIM service option
0.Back
""");
            System.out.print("Choose menu (0-5): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Language...");
                    break;
                case 2:
                    System.out.println("Cell info display...");
                    break;
                case 3:
                    System.out.println("Welcome note...");
                    break;
                case 4:
                    System.out.println("Network selection...");
                    break;
                case 5:
                    System.out.println("Confirm SIM service option...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void securitySettings() {
        while (true) {
            System.out.println("""

1.PIN code request
2.Call barring service
3.Fixed dialing
4.Closed user group
5.Security level
6.Change access codes
0.Back
""");
            System.out.print("Choose menu (0-6): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("PIN code request...");
                    break;
                case 2:
                    System.out.println("Call barring service...");
                    break;
                case 3:
                    System.out.println("Fixed dialing...");
                    break;
                case 4:
                    System.out.println("Closed user group...");
                    break;
                case 5:
                    System.out.println("Security level...");
                    break;
                case 6:
                    System.out.println("Change access codes...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void music() {
        while (true) {
            System.out.println("""

1.Music player
2.Radio
3.Recover
4.Track list
0.Back
""");
            System.out.print("Choose menu (0-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Music player...");
                    break;
                case 2:
                    System.out.println("Radio...");
                    break;
                case 3:
                    System.out.println("Recover...");
                    break;
                case 4:
                    System.out.println("Track list...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void clock() {
        while (true) {
            System.out.println("""

1.Alarm clock
2.Clock settings
3.Date settings
4.Stopwatch
5.Countdown timer
6.Auto update of date and time
0.Back
""");
            System.out.print("Choose menu (0-6): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Alarm clock...");
                    break;
                case 2:
                    System.out.println("Clock settings...");
                    break;
                case 3:
                    System.out.println("Date settings...");
                    break;
                case 4:
                    System.out.println("Stopwatch...");
                    break;
                case 5:
                    System.out.println("Countdown timer...");
                    break;
                case 6:
                    System.out.println("Auto update of date and time...");
                    break;
                case 0:
                    return;
            }
        }
    }

    static void chat() {
        System.out.println("Chat...");
    }

    static void callDivert() {
        System.out.println("Call divert...");
    }

    static void games() {
        System.out.println("Games...");
    }

    static void calculator() {
        System.out.println("Calculator...");
    }

    static void reminders() {
        System.out.println("Reminders...");
    }

    static void profiles() {
        System.out.println("Profiles...");
    }

    static void services() {
        System.out.println("Services...");
    }

    static void simServices() {
        System.out.println("SIM Services...");
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
