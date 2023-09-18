import csv
import datetime

flag = True
lsitDic = []
print(len(lsitDic))

def readCsv():
	try:
		with open("notes\\notes.csv") as file:
			reader = csv.DictReader(file)
			for i in reader:
				lsitDic.append(i)
	except:
		print("nonCSV")

def writeCsv():
	with open("notes\\notes.csv", "w", newline="") as file:
		writer = csv.DictWriter(file, fieldnames=lsitDic[0])
		writer.writeheader()
		for i in range(len(lsitDic)):
			writer.writerow(lsitDic[i])

def addNotes(title, msg):
	lsitDic.append({"N":len(lsitDic)+1, "title":title, 
		"msg":msg, "dateTime": datetime.datetime.now()})

def editNote(serchTitle, msg):
	for i in range(len(lsitDic)):
		if lsitDic[i]["title"] == serchTitle:
			lsitDic[i]["msg"] = msg
			lsitDic[i]["dateTime"] = datetime.datetime.now()

def delNote(serchTitle):
	for i in range(len(lsitDic)):
		if lsitDic[i]["title"] == serchTitle:
			lsitDic.pop(i)
			break;

def outputNotes():
	output = ""
	if len(lsitDic) > 0:
		for i in range(len(lsitDic)):
			output += """N: {}\nTitle: {}\nMsg: {}\nDate: {}\n
	""".format(lsitDic[i]["N"],lsitDic[i]["title"],
	lsitDic[i]["msg"], lsitDic[i]["dateTime"])
	else:
		print("Note is empty")
	return output	

readCsv()

while flag == True:
    
    print("""Выберете операцию:\n
    --notes     - Вывести список заметок.
    --add       - Добавить заметку.
    --edit      - Редактировать заметку.
    --del       - Удалить заметку(X - номер заметки).
    --q         - Выход.""")

    operation = input("Введите операцию: ")
    if operation == "--q":
        flag = False
    elif operation == "--notes":
        print(outputNotes())
    elif operation == "--add":
        addNotes(input("Titles: "), input("Message: "))
    elif operation == "--edit":
        editNote(input("Search note by title: "), input("Edit message:"))
    elif operation == "--del":
        delNote(input("Del note by title: "))
	
    if len(lsitDic) > 0:
        writeCsv()