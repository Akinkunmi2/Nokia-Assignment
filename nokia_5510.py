def main_menu():
    while True:
        print("""
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
""")
        choice = input("Choose from the main menu (0-15): ")

        match choice:
            case "1":
                phone_book()
            case "2":
                messages()
            case "3":
                chat()
            case "4":
                call_register()
            case "5":
                tones()
            case "6":
                settings()
            case "7":
                call_divert()
            case "8":
                music()
            case "9":
                games()
            case "10":
                calculator()
            case "11":
                reminders()
            case "12":
                clock()
            case "13":
                profiles()
            case "14":
                services()
            case "15":
                sim_services()
            case "0":
                print("Goodbye!")
                break
           

def phone_book():
    while True:
        print("""
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
""")
        choice = input("Choose menu (0-11): ")
        match choice:
            case "1":
                print("Search...")
            case "2":
                print("Service Nos...")
            case "3":
                print("Add name...")
            case "4":
                print("Erase...")
            case "5":
                print("Edit...")
            case "6":
                print("Copy...")
            case "7":
                print("Assign tone...")
            case "8":
                print("Send b'card...")
            case "9":
                options()
            case "10":
                print("Speed dials...")
            case "11":
                print("Voice tags...")
            case "0":
                return
          

def options():
    while True:
        print("""
1.Memory in use
2.Type of view
3.Memory status
0.Back
""")
        choice = input("Enter any of the options (0-3): ")
        match choice:
            case "1":
                print("Memory in use...")
            case "2":
                print("Type of view...")
            case "3":
                print("Memory status...")
            case "0":
                return
            

def messages():
    while True:
        print("""
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
""")
        choice = input("Choose any of the options (0-10): ")
        match choice:
            case "1":
                print("Write messages...")
            case "2":
                print("Inbox...")
            case "3":
                print("Outbox...")
            case "4":
                print("Picture messages...")
            case "5":
                print("Templates...")
            case "6":
                print("Smileys...")
            case "7":
                message_settings()
            case "8":
                print("Info service...")
            case "9":
                print("Voice mailbox number...")
            case "10":
                print("Service command editor...")
            case "0":
                return
            
def message_settings():
    while True:
        print("""
1.Set
2.Common
0.Back
""")
        choice = input("Choose any of the options (0-2): ")
        match choice:
            case "1":
                message_settings_set()
            case "2":
                message_settings_common()
            case "0":
                return
           

def message_settings_set():
    while True:
        print("""
1.Messages centre number
2.Messages sent as
3.Messages validity
0.Back
""")
        choice = input("Choose any option (0-3): ")
        match choice:
            case "1":
                print("Messages centre number...")
            case "2":
                print("Messages sent as...")
            case "3":
                print("Messages validity...")
            case "0":
                return
            

def message_settings_common():
    while True:
        print("""
1.Delivery reports
2.Reply via the same centre
3.Character support
0.Back
""")
        choice = input("Choose menu (0-3): ")
        match choice:
            case "1":
                print("Delivery reports...")
            case "2":
                print("Reply via the same centre...")
            case "3":
                print("Character support...")
            case "0":
                return
          
def call_register():
    while True:
        print("""
1.Missed calls
2.Received calls
3.Dialed numbers
4.Erase recent call lists
5.Show call duration
6.Show call costs
7.Call cost settings
8.Prepaid credit
0.Back
""")
        choice = input("Choose any of the options (0-8): ")
        match choice:
            case "1":
                print("Missed calls...")
            case "2":
                print("Received calls...")
            case "3":
                print("Dialed numbers...")
            case "4":
                print("Erase recent call lists...")
            case "5":
                call_duration()
            case "6":
                call_costs()
            case "7":
                call_cost_settings()
            case "8":
                print("Prepaid credit...")
            case "0":
                return
            case _:
                print("Invalid choice, try again.")


def call_duration():
    while True:
        print("""
1.Last call duration
2.All call duration
3.Received calls duration
4.Dialed calls duration
5.Clear timers
0.Back
""")
        choice = input("Choose menu (0-5): ")
        match choice:
            case "1":
                print("Last call duration...")
            case "2":
                print("All call duration...")
            case "3":
                print("Received calls duration...")
            case "4":
                print("Dialed calls duration...")
            case "5":
                print("Clear timers...")
            case "0":
                return
           

def call_costs():
    while True:
        print("""
1.Last call cost
2.All call cost
3.Clear counters
0.Back
""")
        choice = input("Choose menu (0-3): ")
        match choice:
            case "1":
                print("Last call cost...")
            case "2":
                print("All call cost...")
            case "3":
                print("Clear counters...")
            case "0":
                return
            

def call_cost_settings():
    while True:
        print("""
1.Call cost limit
2.Show cost in
0.Back
""")
        choice = input("Choose menu (0-2): ")
        match choice:
            case "1":
                print("Call cost limit...")
            case "2":
                print("Show cost in...")
            case "0":
                return
            

def tones():
    while True:
        print("""
1.Ringing tone
2.Ringing volume
3.Incoming call alert
4.Messages alert tone
5.Keypad tones
6.Warning tones
7.Vibrating alert
8.Screen saver
0.Back
""")
        choice = input("Choose menu (0-8): ")
        match choice:
            case "1":
                print("Ringing tone...")
            case "2":
                print("Ringing volume...")
            case "3":
                print("Incoming call alert...")
            case "4":
                print("Messages alert tone...")
            case "5":
                print("Keypad tones...")
            case "6":
                print("Warning tones...")
            case "7":
                print("Vibrating alert...")
            case "8":
                print("Screen saver...")
            case "0":
                return
            case _:
                print("Invalid choice, try again.")


def settings():
    while True:
        print("""
1.Call settings
2.Phone settings
3.Security settings
4.Restore factory settings
0.Back
""")
        choice = input("Choose any of the options (0-4): ")
        match choice:
            case "1":
                call_settings()
            case "2":
                phone_settings()
            case "3":
                security_settings()
            case "4":
                print("Restore factory settings...")
            case "0":
                return
            case _:
                print("Invalid choice, try again.")


def call_settings():
    while True:
        print("""
1.Automatic redial
2.Speed redial
3.Call waiting options
4.Own number settings
5.Phone number in use
6.Automatic answer
0.Back
""")
        choice = input("Choose menu (0-6): ")
        match choice:
            case "1":
                print("Automatic redial...")
            case "2":
                print("Speed redial...")
            case "3":
                print("Call waiting options...")
            case "4":
                print("Own number settings...")
            case "5":
                print("Phone number in use...")
            case "6":
                print("Automatic answer...")
            case "0":
                return
           

def phone_settings():
    while True:
        print("""
1.Language
2.Cell info display
3.Welcome note
4.Network selection
5.Confirm SIM service option
0.Back
""")
        choice = input("Choose menu (0-5): ")
        match choice:
            case "1":
                print("Language...")
            case "2":
                print("Cell info display...")
            case "3":
                print("Welcome note...")
            case "4":
                print("Network selection...")
            case "5":
                print("Confirm SIM service option...")
            case "0":
                return
           
def security_settings():
    while True:
        print("""
1.PIN code request
2.Call barring service
3.Fixed dialing
4.Closed user group
5.Security level
6.Change access codes
0.Back
""")
        choice = input("Choose menu (0-6): ")
        match choice:
            case "1":
                print("PIN code request...")
            case "2":
                print("Call barring service...")
            case "3":
                print("Fixed dialing...")
            case "4":
                print("Closed user group...")
            case "5":
                print("Security level...")
            case "6":
                print("Change access codes...")
            case "0":
                return
            

def music():
    while True:
        print("""
1.Music player
2.Radio
3.Recover
4.Track list
0.Back
""")
        choice = input("Choose menu (0-4): ")
        match choice:
            case "1":
                print("Music player...")
            case "2":
                print("Radio...")
            case "3":
                print("Recover...")
            case "4":
                print("Track list...")
            case "0":
                return
           
def clock():
    while True:
        print("""
1.Alarm clock
2.Clock settings
3.Date settings
4.Stopwatch
5.Countdown timer
6.Auto update of date and time
0.Back
""")
        choice = input("Choose menu (0-6): ")
        match choice:
            case "1":
                print("Alarm clock...")
            case "2":
                print("Clock settings...")
            case "3":
                print("Date settings...")
            case "4":
                print("Stopwatch...")
            case "5":
                print("Countdown timer...")
            case "6":
                print("Auto update of date and time...")
            case "0":
                return
          
def chat():
    print("Chat...")


def call_divert():
    print("Call divert...")


def games():
    print("Games...")


def calculator():
    print("Calculator...")


def reminders():
    print("Reminders...")


def profiles():
    print("Profiles...")


def services():
    print("Services...")


def sim_services():
    print("SIM Services...")


main_menu()
