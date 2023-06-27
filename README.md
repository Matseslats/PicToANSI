# PicToANSI
Generate ANSI from a picture. Pixels more than 50% transparent will not be displayed

## Instructions
### Creation
1. Create your image, save it as image.png in the same directory as the executable. This can be found in the `Win64` directory.
1. Run the executable.
2. The output can be found in the file `out.txt`.

### Display
1. Make a file on a linux machine with the file extension `.sh`. This example uses the file `file.sh`.
1. Open it with an editor like nano with `nano file.sh`. 
1. Write `#!/bin/bash/` on the first line to make it executable.
1. Copy the contents of `out.txt` to `file.sh`, starting on line two.
1. Save and exit the editor. With `nano`, use `ctrl+x`, then press `y`.
1. Make the file executable for everyone using `chmod a+x file.sh`
1. Run your file with the command `./file.sh`.

## Preview
![Origin image.](/image.png "Sample image used.")
![Output text.](/output.png "Output text produced.")

## Support me: 

<a href="https://www.buymeacoffee.com/matseslats" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 30px !important;width: 108px !important;" ></a>