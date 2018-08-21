export class Task {

    id:Number;
    title:string;
    completed:boolean;

    constructor(id,title,completed){
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

}