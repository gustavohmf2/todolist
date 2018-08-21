import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
  name: 'taskFilter'
})
export class TaskFilter implements PipeTransform {

    transform(items: any[], filterTipe: string): any[] {
        
        if(!items) return [];
        if(!filterTipe) return items;
        
        if(filterTipe == 'completed'){

            return items.filter( item => {

                return item.completed? item : null; 
            });
        } else if(filterTipe == 'active'){
            return items.filter( item => {

                return item.completed? null : item; 
            })
        }else {
            return items;
        }
    }

}