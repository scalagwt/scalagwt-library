package scala.reflect
package api

trait TreePrinters { self: Universe =>

  trait TreePrinter {
    def print(args: Any*)
    protected var typesPrinted = false
    protected var uniqueIds = false
    def withTypesPrinted: this.type = { typesPrinted = true; this }
    def withUniqueIds: this.type = { uniqueIds = true; this }
  }

  def show(tree: Tree): String = ???

}
