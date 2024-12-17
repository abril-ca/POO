FONTES = $(wildcard *.puml)
FONTESDOT = $(wildcard *.dot)
PNG = $(FONTES:.puml=.png) 
PNGDOT = $(FONTESDOT:.dot=.png) 

%.png: %.puml
	@java -jar ~/Downloads/plantuml.jar $^

%.png: %.dot
	dot -Tpng $< -Gdpi=300 -o $@

all: $(PNG) $(PNGDOT)

clean:
	rm *.png
