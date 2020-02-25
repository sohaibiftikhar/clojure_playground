# clojure-noob

FIXME: description

## Installation

Download from http://example.com/FIXME.

## Usage

FIXME: explanation

    $ java -jar clojure-noob-0.1.0-standalone.jar [args]

## Learnings
* Maps can be passed multiple maps  
  ```
  (map str ["a" "b" "c"] ["A" "B" "C"])
  ; => ("aA" "bB" "cC")
  ```
* Popular sequence functions: map reduce take-while drop-while filter some count concat
* Some return value instead of true:
  ```$xslt
  (some #(and (> (:critter %) 3) %) food-journal)
  ```
* vim-fireplace shortcuts:
  * gf = jump to namespace under cursor (goto file)
  * cpr and :Require! - (require :reload) or (require reload-all)
  * `Eval (clojure code)` - evaluate arbitratry clojure code
  * `cqp` - open quasi REPL
  * `cpp` - execute current block
  * `:lopen` open stacktracce for last error
  * `C-x C-o` for omni-complete `C-n C-p` also work fine.
  * `Shift-k` for getting documentation
  * `:Doc ` for looking up documentation for symbol
  * `[d` display the source for the symbol under cursor
  * `:Source ` display source for symbol entered in prompt
  * `[C-D` jumps to the definition of a symbol
  * `:RunTests` kicks of `(clojure.test/run-tests)` and loads results into quickfix
  * 
  
## License

Copyright © 2020 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
